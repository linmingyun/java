package com.heimu;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

public class UserDaoImpl {

    private RedisTemplate<Serializable, Serializable> redisTemplate;

    public void setRedisTemplate(RedisTemplate<Serializable, Serializable> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void saveUser(final String userName) {
        redisTemplate.execute(new RedisCallback<Object>() {
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                byte[] key = redisTemplate.getStringSerializer().serialize("userName");
                byte[] val = redisTemplate.getStringSerializer().serialize(userName);
                connection.set(key,val);
                return null;
            }
        });
    }

    public String getUser(final String userName) {
        return redisTemplate.execute(new RedisCallback<String>() {
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                byte[] key = redisTemplate.getStringSerializer().serialize(userName);
                if (connection.exists(key)) {
                    byte[] val = connection.get(key);
                    String userName = redisTemplate.getStringSerializer().deserialize(val);
                    return userName;
                }
                return null;
            }
        });
    }
}

package jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedisPool {
    // Jedispool
    JedisCommands jedisCommands;
    JedisPool jedisPool;
    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    String ip = "192.168.x.x";
    int port = 6379;
    int timeout = 2000;

    public TestJedisPool() {
        // 初始化jedis
        // 设置配置
        jedisPoolConfig.setMaxTotal(1024);
        jedisPoolConfig.setMaxIdle(100);
        jedisPoolConfig.setMaxWaitMillis(100);
        jedisPoolConfig.setTestOnBorrow(false);//jedis 第一次启动时，会报错
        jedisPoolConfig.setTestOnReturn(true);
        // 初始化JedisPool
        jedisPool = new JedisPool(jedisPoolConfig, ip, port, timeout);
        //
        Jedis jedis = jedisPool.getResource();

        jedisCommands = jedis;
    }

    public void setValue(String key, String value) {
        this.jedisCommands.set(key, value);
    }

    public String getValue(String key) {
        return this.jedisCommands.get(key);
    }

    public static void main(String[] args) {
        TestJedisPool testJedis = new TestJedisPool();
        testJedis.setValue("testJedisKey", "testJedisValue");
        System.out.println("get value from redis:{}"+testJedis.getValue("testJedisKey"));
    }

}

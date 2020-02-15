package com.heimu.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class TestRedis {

    public static void main(String[] args) throws Exception {
        //@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-redis.xml");
        RedisUtil redisUtil = (RedisUtil) context.getBean("redisUtil");
          
        //=====================testString======================  
        redisUtil.set("name", "王赛超");  
        redisUtil.set("age", 24);  
        redisUtil.set("address", "河北邯郸");  
          
        System.out.println(redisUtil.set("address", "河北邯郸", 50));
        System.out.println(redisUtil.get("age"));

        redisUtil.set("age", 1000);
        Object object = redisUtil.get("user2");
        System.out.println(object);

        redisUtil.del("address");
        redisUtil.set("class", 15);
        long incr = redisUtil.incr("age", 1);
        System.out.println(incr);

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name", "王赛超"); 
        map.put("age", 24);
        map.put("address", "河北邯郸666"); 
        redisUtil.hmset("15532002725", map,1000);

        redisUtil.del("15532002725");
        redisUtil.hset("15532002725","address","河北邯郸",1000);
        redisUtil.hdel("15532002725", "name");
        System.out.println(redisUtil.sSetAndTime("15532002727",1000,"haha"));
        System.out.println(redisUtil.sGet("15532002727"));
        System.out.println(redisUtil.sHasKey("15532002727","name"));
        System.out.println(redisUtil.lRemove("15532002728",1,2));
        System.out.println(redisUtil.lGet("15532002728",0,-1));
        System.out.println(redisUtil.lGetListSize("15532002728"));
        System.out.println(redisUtil.lGetIndex("15532002728",1));
        System.out.println(redisUtil.getExpire("15532002725"));
        System.out.println(redisUtil.hget("15532002725","name"));
        System.out.println(redisUtil.hmget("15532002725"));

        UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
        userDao.saveUser("Apache Software Foundation -- Royal Never Give Up");
        System.out.println(userDao.getUser("userName"));
    }
}
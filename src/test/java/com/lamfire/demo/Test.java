package com.lamfire.demo;

import com.lamfire.redis.Redis;
import com.lamfire.redis.RedisFactory;

/**
 * Created with IntelliJ IDEA.
 * User: linfan
 * Date: 15-9-15
 * Time: 上午11:41
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Redis redis = RedisFactory.getInstance().getRedis();
        redis.put("test","12345");
        String v = redis.get("test");
        System.out.println(v);
    }
}

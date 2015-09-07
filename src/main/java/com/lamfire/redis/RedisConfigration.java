package com.lamfire.redis;

import java.util.Map;

import redis.clients.jedis.JedisPoolConfig;

import com.lamfire.logger.Logger;
import com.lamfire.logger.LoggerFactory;
import com.lamfire.utils.ClassLoaderUtils;
import com.lamfire.utils.PropertiesUtils;

public class RedisConfigration {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfigration.class);
    
    private JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    private Map<String, String> conf;

    public RedisConfigration(String resourceName) {
        conf = PropertiesUtils.loadAsMap(ClassLoaderUtils.getResourceAsStream(resourceName, RedisConfigration.class));
        logger.info("[RedisConfig]:" + conf);
        init();
        logger.info("[maxActive]:" +jedisPoolConfig.getMaxActive());
        logger.info("[maxIdle]:" +jedisPoolConfig.getMaxIdle());
        logger.info("[maxWait]:" +jedisPoolConfig.getMaxWait());
        logger.info("[minEvictableIdleTimeMillis]:" +jedisPoolConfig.getMinEvictableIdleTimeMillis());
        logger.info("[minIdle]:" +jedisPoolConfig.getMinIdle());
        logger.info("[numTestsPerEvictionRun]:" +jedisPoolConfig.getNumTestsPerEvictionRun());
        logger.info("[softMinEvictableIdleTimeMillis]:" +jedisPoolConfig.getSoftMinEvictableIdleTimeMillis());
        logger.info("[timeBetweenEvictionRunsMillis]:" +jedisPoolConfig.getTimeBetweenEvictionRunsMillis());
        logger.info("[whenExhaustedAction]:" +jedisPoolConfig.getWhenExhaustedAction());
    }
    
    public JedisPoolConfig getJedisPoolConfig(){
        return jedisPoolConfig;
    }
    
    private void init(){
        jedisPoolConfig.setMaxActive(getMaxActive());
        jedisPoolConfig.setMaxIdle(getMaxIdle());
        jedisPoolConfig.setMaxWait(getMaxWait());
        jedisPoolConfig.setMinEvictableIdleTimeMillis(getMinEvictableIdleTimeMillis());
        jedisPoolConfig.setMinIdle(getMinIdle());
        jedisPoolConfig.setNumTestsPerEvictionRun(getNumTestsPerEvictionRun());
        jedisPoolConfig.setSoftMinEvictableIdleTimeMillis(getSoftMinEvictableIdleTimeMillis());
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(getTimeBetweenEvictionRunsMillis());
        jedisPoolConfig.setWhenExhaustedAction(getWhenExhaustedAction());
    }
    
    public String getServerHost(){
        return conf.get("redis.server.host");
    }
    
    public int getServerPort(){
        String v = conf.get("redis.server.port");
        return Integer.parseInt(v);
    }
    
    public int getMaxActive(){
        String v = conf.get("redis.maxActive");
        return Integer.parseInt(v);
    }
     public int getMaxIdle(){
         String v = conf.get("redis.maxIdle");
         return Integer.parseInt(v);
     }
     public int getMaxWait(){
         String v = conf.get("redis.maxWait");
         return Integer.parseInt(v);
     }
     public long getMinEvictableIdleTimeMillis(){
         String v = conf.get("redis.minEvictableIdleTimeMillis");
         return Long.parseLong(v);
     }
     public int getMinIdle(){
         String v = conf.get("redis.minIdle");
         return Integer.parseInt(v);
     }
     public int getNumTestsPerEvictionRun(){
         String v = conf.get("redis.numTestsPerEvictionRun");
         return Integer.parseInt(v);
     }
     public long getSoftMinEvictableIdleTimeMillis(){
         String v = conf.get("redis.softMinEvictableIdleTimeMillis");
         return Long.parseLong(v);
     }
     public long getTimeBetweenEvictionRunsMillis(){
         String v = conf.get("redis.timeBetweenEvictionRunsMillis");
         return Long.parseLong(v);
     }
     public byte getWhenExhaustedAction(){
         String v = conf.get("redis.whenExhaustedAction");
         return Byte.parseByte(v);
     }

    public int getTimeout(){
        String v = conf.get("redis.timeout");
        if("".equals(v) || v == null){
            return 2000;
        }
        return Integer.parseInt(v);
    }
}

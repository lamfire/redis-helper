package com.lamfire.redis;

import java.util.HashMap;

import redis.clients.jedis.JedisPool;

import com.lamfire.logger.Logger;
import com.lamfire.logger.LoggerFactory;

public class RedisFactory {

	static final Logger logger = LoggerFactory.getLogger(RedisFactory.class);
	static final String DefaultConfigFile = "redis.properties";
	private static final HashMap<String,RedisFactory> factories = new HashMap<String,RedisFactory>();
	private JedisPool pool;
	private RedisCli redisCli;
	private Redis redis;

	private RedisFactory(String resource) {
		RedisConfigration configration = new RedisConfigration(resource);
		pool = new JedisPool(configration.getJedisPoolConfig(), configration.getServerHost(), configration.getServerPort(),configration.getTimeout());
	}

	public synchronized RedisCli getRedisCli() {
		if (redisCli == null) {
			redisCli = new RedisCli(pool);
		}
		return redisCli;
	}

	public synchronized Redis getRedis() {
		if (redis == null) {
			redis = new Redis(getRedisCli());
		}
		return redis;
	}

	public JedisPool getJedisPool() {
		return pool;
	}

	public synchronized static RedisFactory getInstance() {
		return getInstance(DefaultConfigFile);
	}

	public synchronized static RedisFactory getInstance(String configResource) {
		RedisFactory factory = factories.get(configResource);
		if(factory == null){
			factory = new RedisFactory(configResource);
			factories.put(configResource, factory);
		}
		return factory;
	}
}

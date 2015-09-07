package com.lamfire.redis;

import java.util.List;

public class RedisStringArray implements Array<String>{
	
	private String key;
	private RedisCli client;
	
	RedisStringArray(String key,RedisCli client){
		this.key = key;
		this.client = client;
	}

	@Override
	public String get(int index) {
		return client.lindex(key, index);
	}

	@Override
	public void set(int index, String bytes) {
		client.lset(key, index, bytes);
	}

	@Override
	public List<String> range(int from, int to) {
		return client.lrange(key, from, to);
	}

	@Override
	public void expire(int seconds) {
		client.expire(key, seconds);
	}

	@Override
	public long ttl() {
		return client.ttl(key);
	}
	
	@Override
	public long size() {
		return client.llen(key);
	}
	
	@Override
	public void add(String val) {
		client.rpush(key, val);		
	}

	@Override
	public void remove() {
		client.del(key);
	}

	@Override
	public long expireAt(long expireAt) {
		return client.expireAt(key, expireAt);
	}
}

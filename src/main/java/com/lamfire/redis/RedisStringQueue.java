package com.lamfire.redis;

public class RedisStringQueue implements Queue<String>{

	private String key;
	private RedisCli client;
	
	RedisStringQueue(String key,RedisCli client){
		this.key = key;
		this.client = client;
	}

	@Override
	public String pop() {
		return client.rpop(key);
	}

	@Override
	public void push(String bytes) {
		client.lpush(key, bytes);
	}

	@Override
	public long size() {
		return client.llen(key);
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
	public void remove() {
		client.del(key);
	}
	
	@Override
	public long expireAt(long expireAt) {
		return client.expireAt(key, expireAt);
	}
}

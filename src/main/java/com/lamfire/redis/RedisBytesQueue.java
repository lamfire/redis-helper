package com.lamfire.redis;

public class RedisBytesQueue implements Queue<byte[]>{

	private byte[] key;
	private RedisCli client;
	
	RedisBytesQueue(byte[] key,RedisCli client){
		this.key = key;
		this.client = client;
	}

	@Override
	public byte[] pop() {
		return client.rpop(key);
	}

	@Override
	public void push(byte[] bytes) {
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

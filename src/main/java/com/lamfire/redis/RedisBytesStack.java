package com.lamfire.redis;

public class RedisBytesStack implements Stack<byte[]>{

	private byte[] key;
	private RedisCli client;
	
	RedisBytesStack(byte[] key,RedisCli client){
		this.key = key;
		this.client = client;
	}

	@Override
	public byte[] pop() {
		return client.lpop(key);
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
	public long expireAt(long expireAt) {
		return client.expireAt(key, expireAt);
	}
}

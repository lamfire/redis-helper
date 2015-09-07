package com.lamfire.redis;

import java.util.List;
import java.util.Set;

public class RedisBytesMap implements Map<byte[]>{

	private byte[] id;
	private RedisCli client;
	
	RedisBytesMap(byte[] id,RedisCli client){
		this.id = id;
		this.client = client;
	}
	
	@Override
	public byte[] get(byte[] key) {
		return client.hget(id, key);
	}

	@Override
	public void put(byte[] key, byte[] val) {
		client.hset(id, key, val);
	}

	@Override
	public long size() {
		return client.hlen(id);
	}

	@Override
	public List<byte[]> gets(byte[]... keys) {
		return client.hmget(id, keys);
	}

	@Override
	public long increase(byte[] key) {
		return client.hincrBy(id, key);
	}

	@Override
	public Set<byte[]> keys() {
		return client.hkeys(id);
	}

	@Override
	public List<byte[]> values() {
		return client.hvals(id);
	}

	@Override
	public void remove(byte[] key) {
		client.hdel(id, key);
	}

	@Override
	public void expire(int seconds) {
		client.expire(id, seconds);
	}

	@Override
	public long ttl() {
		return client.ttl(id);
	}
	
	@Override
	public void remove() {
		client.del(id);
	}

	@Override
	public long increase(byte[] key, long step) {
		return client.hincrBy(id, key, step);
	}

	@Override
	public void putAll(java.util.Map<byte[], byte[]> map) {
		client.hmset(id, map);
	}

	@Override
	public java.util.Map<byte[], byte[]> getAll() {
		return client.hgetAll(id);
	}
	
	@Override
	public long expireAt(long expireAt) {
		return client.expireAt(id, expireAt);
	}
}

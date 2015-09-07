package com.lamfire.redis;

import java.util.List;
import java.util.Set;

public class RedisStringMap implements Map<String>{

	private String id;
	private RedisCli client;
	
	RedisStringMap(String id,RedisCli client){
		this.id = id;
		this.client = client;
	}
	
	@Override
	public String get(String key) {
		return client.hget(id, key);
	}

	@Override
	public void put(String key,String val) {
		client.hset(id, key, val);
	}

	@Override
	public long size() {
		return client.hlen(id);
	}

	@Override
	public List<String> gets(String... keys) {
		return client.hmget(id, keys);
	}

	@Override
	public long increase(String key) {
		return client.hincrBy(id, key);
	}

	@Override
	public Set<String> keys() {
		return client.hkeys(id);
	}

	@Override
	public List<String> values() {
		return client.hvals(id);
	}

	@Override
	public void remove(String key) {
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
	public long increase(String key, long step) {
		return client.hincrBy(id, key, step);
	}

	@Override
	public void putAll(java.util.Map<String, String> map) {
		client.hmset(id, map);
	}

	@Override
	public java.util.Map<String, String> getAll() {
		return client.hgetAll(id);
	}
	
	@Override
	public long expireAt(long expireAt) {
		return client.expireAt(id, expireAt);
	}
}

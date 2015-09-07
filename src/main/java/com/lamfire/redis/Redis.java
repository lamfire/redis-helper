package com.lamfire.redis;

import java.util.List;
import java.util.Set;

public class Redis {
	private RedisCli redisCli;

	public Redis(RedisCli redisCli) {
		this.redisCli = redisCli;
	}

	public RankSet<String> getRankSet(String key) {
		return new RedisStringRankSet(key, getRedisCli());
	}

	public RankSet<byte[]> getRankSet(byte[] key) {
		return new RedisBytesRankSet(key, getRedisCli());
	}

	public Map<String> getMap(String id) {
		return new RedisStringMap(id, getRedisCli());
	}

	public Map<byte[]> getMap(byte[] id) {
		return new RedisBytesMap(id, getRedisCli());
	}

	public Array<String> getArray(String key) {
		return new RedisStringArray(key, getRedisCli());
	}

	public Array<byte[]> getArray(byte[] key) {
		return new RedisBytesArray(key, getRedisCli());
	}

	public Queue<byte[]> getQueue(byte[] key) {
		return new RedisBytesQueue(key, getRedisCli());
	}

	public Queue<String> getQueue(String key) {
		return new RedisStringQueue(key, getRedisCli());
	}

	public Stack<byte[]> getStack(byte[] key) {
		return new RedisBytesStack(key, getRedisCli());
	}

	public Stack<String> getStack(String key) {
		return new RedisStringStack(key, getRedisCli());
	}

	public RedisCli getRedisCli() {
		return redisCli;
	}

	public long decrease(String key) {
		return getRedisCli().decr(key);
	}

	public long decrease(byte[] key) {
		return getRedisCli().decr(key);
	}

	public long decrease(String key, long val) {
		return getRedisCli().decrBy(key, val);
	}

	public long decrease(byte[] key, long val) {
		return getRedisCli().decrBy(key, val);
	}

	public boolean exists(String key) {
		return getRedisCli().exists(key);
	}

	public boolean exists(byte[] key) {
		return getRedisCli().exists(key);
	}

	public long increase(String key) {
		return getRedisCli().incr(key);
	}

	public long increase(byte[] key) {
		return getRedisCli().incr(key);
	}

	public long increase(String key, long step) {
		return getRedisCli().incrBy(key, step);
	}

	public long increase(byte[] key, long step) {
		return getRedisCli().incrBy(key, step);
	}

	public void put(byte[] key, byte[] value) {
		getRedisCli().set(key, value);
	}

	public void put(String key, String value) {
		getRedisCli().set(key, value);
	}

	public void put(byte[] key, byte[] value, int expirySeconds) {
		getRedisCli().set(key, value, expirySeconds);
	}

	public void put(String key, String value, int expirySeconds) {
		getRedisCli().set(key, value, expirySeconds);
	}

	public byte[] get(byte[] key) {
		return getRedisCli().get(key);
	}

	public String get(String key) {
		return getRedisCli().get(key);
	}
	
    public Set<String> keys(String pattern) {
    	return getRedisCli().keys(pattern);
    }
    
    public Set<byte[]> keys(byte[] pattern) {
    	return getRedisCli().keys(pattern);
    }

	public List<String> gets(String... keys) {
		return getRedisCli().mget(keys);
	}

	public List<byte[]> gets(byte[]... keys) {
		return getRedisCli().mget(keys);
	}

	public long expire(String key, int seconds) {
		return getRedisCli().expire(key, seconds);
	}

	public long expire(byte[] key, int seconds) {
		return getRedisCli().expire(key, seconds);
	}

	public long expireAt(String key, long expireAt) {
		return getRedisCli().expireAt(key, expireAt);
	}

	public long expireAt(byte[] key, long expireAt) {
		return getRedisCli().expireAt(key, expireAt);
	}

	public long remove(String key) {
		return getRedisCli().del(key);
	}

	public long remove(byte[] key) {
		return getRedisCli().del(key);
	}

	public long ttl(byte[] key) {
		return getRedisCli().ttl(key);
	}

	public long ttl(String key) {
		return getRedisCli().ttl(key);
	}
}

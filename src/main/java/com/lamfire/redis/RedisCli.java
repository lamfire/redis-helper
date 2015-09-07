package com.lamfire.redis;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.SortingParams;
import redis.clients.jedis.Tuple;
import redis.clients.jedis.BinaryClient.LIST_POSITION;

public class RedisCli {

	private JedisPool pool;

	RedisCli(JedisPool pool) {
		this.pool = pool;
	}

	public Boolean exists(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.exists(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean exists(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.exists(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long incr(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incr(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long incr(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incr(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long incrBy(String key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incrBy(key, step);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long incrBy(byte[] key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incrBy(key, step);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long append(String key, String val) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.append(key, val);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long append(byte[] key, byte[] val) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.append(key, val);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long decr(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decr(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public long decr(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decr(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long decrBy(String key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decrBy(key, step);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long decrBy(byte[] key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decrBy(key, step);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean hexists(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hexists(key, field);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean hexists(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hexists(key, field);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String get(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.get(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] get(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.get(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String hget(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hget(key, field);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] hget(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			byte[] bytes = jedis.hget(key, field);
			return bytes;
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String set(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.set(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public void set(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			jedis.set(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] lindex(byte[] key, long index) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lindex(key, index);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<String> mget(String... keys) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.mget(keys);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<byte[]> mget(byte[]... keys) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.mget(keys);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] getSet(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getSet(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String getSet(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getSet(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public void lpush(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			jedis.lpush(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long lpush(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lpush(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long rpush(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpush(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long rpush(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpush(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String lpop(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lpop(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] lpop(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lpop(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String rpop(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpop(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] rpop(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpop(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hset(byte[] key, byte[] field, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hset(key, field, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hlen(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hlen(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hlen(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hlen(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long llen(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.llen(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long llen(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.llen(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hset(String key, String field, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hset(key, field, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> hkeys(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hkeys(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> hkeys(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hkeys(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> keys(String pattern) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.keys(pattern);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> keys(byte[] pattern) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.keys(pattern);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<byte[]> hvals(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hvals(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<String> hvals(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hvals(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<String> hmget(String key, String... fields) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmget(key, fields);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<byte[]> hmget(byte[] key, byte[]... fields) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmget(key, fields);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public void hmset(byte[] key, java.util.Map<byte[], byte[]> map) {
		Jedis jedis = pool.getResource();
		try {
			jedis.hmset(key, map);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String hmset(String key, java.util.Map<String, String> map) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmset(key, map);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public java.util.Map<byte[], byte[]> hgetAll(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hgetAll(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public java.util.Map<String, String> hgetAll(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hgetAll(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hdel(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hdel(key, field);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hdel(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hdel(key, field);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hincrBy(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, 1);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hincrBy(String key, String field, long value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hincrBy(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, 1);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public long hincrBy(byte[] key, byte[] field, long value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public void set(byte[] key, byte[] value, int expirySeconds) {
		Jedis jedis = pool.getResource();
		try {
			jedis.set(key, value);
			jedis.expire(key, expirySeconds);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public void set(String key, String value, int expirySeconds) {
		Jedis jedis = pool.getResource();
		try {
			jedis.set(key, value);
			jedis.expire(key, expirySeconds);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long expire(String key, int seconds) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expire(key, seconds);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long expire(byte[] key, int seconds) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expire(key, seconds);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long del(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.del(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long del(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.del(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long ttl(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ttl(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long ttl(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ttl(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long expireAt(String key, long expireAt) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expireAt(key, expireAt);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long expireAt(byte[] key, long expireAt) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expireAt(key, expireAt);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean getbit(String key, long offset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getbit(key, offset);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean getbit(byte[] key, long offset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getbit(key, offset);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String getrange(String key, long startOffset, long endOffset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getrange(key, startOffset, endOffset);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] getrange(byte[] key, long startOffset, long endOffset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getrange(key, startOffset, endOffset);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hsetnx(String key, String field, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hsetnx(key, field, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long hsetnx(byte[] key, byte[] field, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hsetnx(key, field, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String lindex(String key, long index) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lindex(key, index);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long linsert(String key, LIST_POSITION where, String pivot, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.linsert(key, where, pivot, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<String> lrange(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrange(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<byte[]> lrange(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrange(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long lrem(String key, long count, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrem(key, count, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long lrem(byte[] key, long count, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrem(key, count, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String lset(String key, long index, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lset(key, index, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String lset(byte[] key, long index, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lset(key, index, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String ltrim(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ltrim(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String ltrim(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ltrim(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long sadd(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sadd(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long sadd(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sadd(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long scard(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.scard(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long scard(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.scard(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean setbit(String key, long offset, boolean value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setbit(key, offset, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean setbit(byte[] key, long offset, boolean value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setbit(key, offset, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String setex(String key, int seconds, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setex(key, seconds, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String setex(byte[] key, int seconds, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setex(key, seconds, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long setnx(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setnx(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long setnx(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setnx(key, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long setrange(String key, long offset, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setrange(key, offset, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long setrange(byte[] key, long offset, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setrange(key, offset, value);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean sismember(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sismember(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Boolean sismember(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sismember(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> smembers(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.smembers(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> smembers(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.smembers(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<String> sort(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<byte[]> sort(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<String> sort(String key, SortingParams sortingParameters) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key, sortingParameters);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public List<byte[]> sort(byte[] key, SortingParams sortingParameters) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key, sortingParameters);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String spop(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.spop(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] spop(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.spop(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String srandmember(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srandmember(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] srandmember(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srandmember(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long srem(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srem(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long srem(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srem(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String substr(String key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.substr(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public byte[] substr(byte[] key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.substr(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String type(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.type(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String type(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.type(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zadd(String key, double score, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zadd(key, score, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zadd(byte[] key, double score, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zadd(key, score, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zcard(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcard(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zcard(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcard(key);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zcount(String key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcount(key, min, max);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zcount(byte[] key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcount(key, min, max);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Double zincrby(String key, double score, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zincrby(key, score, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Double zincrby(byte[] key, double score, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zincrby(key, score, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> zrange(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrange(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> zrange(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrange(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> zrangeByScore(String key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> zrangeByScore(byte[] key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> zrangeByScore(String key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> zrangeByScore(byte[] key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrangeWithScores(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeWithScores(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrangeWithScores(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeWithScores(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zrank(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrank(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zrank(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrank(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zrem(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrem(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zrem(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrem(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zremrangeByRank(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByRank(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zremrangeByRank(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByRank(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zremrangeByScore(String key, double start, double end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByScore(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zremrangeByScore(byte[] key, double start, double end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByScore(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> zrevrange(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrange(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> zrevrange(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrange(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> zrevrangeByScore(String key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<String> zrevrangeByScore(String key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min, offset, count);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrevrangeWithScores(String key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeWithScores(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Set<Tuple> zrevrangeWithScores(byte[] key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeWithScores(key, start, end);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zrevrank(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrank(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long zrevrank(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrank(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Double zscore(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zscore(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Double zscore(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zscore(key, member);
		} catch (Exception e) {
			pool.returnBrokenResource(jedis);
			throw new RuntimeException(e);
		} finally {
			pool.returnResource(jedis);
		}
	}

}

package com.lamfire.redis;

import java.io.Closeable;
import java.io.IOException;
import java.util.*;
import java.util.Map;

import redis.clients.jedis.*;
import redis.clients.jedis.BinaryClient.LIST_POSITION;

public class RedisCli implements BinaryJedisCommands, MultiKeyBinaryCommands, Closeable {

	private JedisPool pool;

	RedisCli(JedisPool pool) {
		this.pool = pool;
	}

	public Boolean exists(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.exists(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean exists(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.exists(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long persist(byte[] key) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.persist(key);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long incr(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incr(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long incr(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incr(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long incrBy(String key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incrBy(key, step);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long incrBy(byte[] key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.incrBy(key, step);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Double incrByFloat(byte[] key, double value) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.incrByFloat(key,value);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long append(String key, String val) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.append(key, val);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long append(byte[] key, byte[] val) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.append(key, val);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long decr(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decr(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long decr(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decr(key);
		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long decrBy(String key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decrBy(key, step);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long decrBy(byte[] key, long step) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.decrBy(key, step);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean hexists(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hexists(key, field);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean hexists(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hexists(key, field);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long hdel(byte[] key, byte[]... field) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.hdel(key,field);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public String get(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.get(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] get(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.get(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String hget(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hget(key, field);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] hget(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			byte[] bytes = jedis.hget(key, field);
			return bytes;

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String set(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.set(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String set(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.set(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public String set(byte[] key, byte[] value, byte[] nxxx, byte[] expx, long time) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.set(key,value,nxxx,expx,time);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public byte[] lindex(byte[] key, long index) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lindex(key, index);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<String> mget(String... keys) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.mget(keys);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<byte[]> mget(byte[]... keys) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.mget(keys);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public String mset(byte[]... keysvalues) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.mset(keysvalues);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long msetnx(byte[]... keysvalues) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.msetnx(keysvalues);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String rename(byte[] oldkey, byte[] newkey) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.rename(oldkey,newkey);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long renamenx(byte[] oldkey, byte[] newkey) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.renamenx(oldkey, newkey);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public byte[] rpoplpush(byte[] srckey, byte[] dstkey) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.rpoplpush(srckey, dstkey);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> sdiff(byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sdiff(keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long sdiffstore(byte[] dstkey, byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sdiffstore(dstkey,keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> sinter(byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sinter(keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long sinterstore(byte[] dstkey, byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sinterstore(dstkey, keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long smove(byte[] srckey, byte[] dstkey, byte[] member) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.smove(srckey, dstkey, member);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long sort(byte[] key, SortingParams sortingParameters, byte[] dstkey) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sort(key, sortingParameters,dstkey);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long sort(byte[] key, byte[] dstkey) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sort(key, dstkey);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> sunion(byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sunion(keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long sunionstore(byte[] dstkey, byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sunionstore(dstkey, keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String watch(byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.watch(keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String unwatch() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.unwatch();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long zinterstore(byte[] dstkey, byte[]... sets) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zinterstore(dstkey, sets);
        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long zinterstore(byte[] dstkey, ZParams params, byte[]... sets) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zinterstore(dstkey, sets);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long zunionstore(byte[] dstkey, byte[]... sets) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zunionstore(dstkey, sets);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long zunionstore(byte[] dstkey, ZParams params, byte[]... sets) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zunionstore(dstkey, sets);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public byte[] brpoplpush(byte[] source, byte[] destination, int timeout) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.brpoplpush(source, destination, timeout);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long publish(byte[] channel, byte[] message) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.publish(channel, message);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public void subscribe(BinaryJedisPubSub jedisPubSub, byte[]... channels) {
        Jedis jedis = pool.getResource();
        try {
            jedis.subscribe(jedisPubSub, channels);
        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public void psubscribe(BinaryJedisPubSub jedisPubSub, byte[]... patterns) {
        Jedis jedis = pool.getResource();
        try {
            jedis.psubscribe(jedisPubSub, patterns);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public byte[] randomBinaryKey() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.randomBinaryKey();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long bitop(BitOP op, byte[] destKey, byte[]... srcKeys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.bitop(op, destKey, srcKeys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String pfmerge(byte[] destkey, byte[]... sourcekeys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pfmerge(destkey, sourcekeys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long pfcount(byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pfcount(keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public byte[] getSet(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getSet(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String getSet(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getSet(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public void lpush(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			jedis.lpush(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long lpush(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lpush(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long rpush(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpush(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long rpush(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpush(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String lpop(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lpop(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] lpop(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lpop(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String rpop(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpop(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] rpop(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.rpop(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long sadd(byte[] key, byte[]... member) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.sadd(key,member);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long hset(byte[] key, byte[] field, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hset(key, field, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hlen(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hlen(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hlen(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hlen(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long llen(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.llen(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long llen(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.llen(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hset(String key, String field, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hset(key, field, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<String> hkeys(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hkeys(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> hkeys(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hkeys(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<String> keys(String pattern) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.keys(pattern);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long del(byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.del(keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public List<byte[]> blpop(int timeout, byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.blpop(timeout, keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public List<byte[]> brpop(int timeout, byte[]... keys) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.brpop(timeout, keys);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public List<byte[]> blpop(byte[]... args) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.blpop(args);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public List<byte[]> brpop(byte[]... args) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.brpop(args);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<byte[]> keys(byte[] pattern) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.keys(pattern);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<byte[]> hvals(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hvals(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<String> hvals(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hvals(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<String> hmget(String key, String... fields) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmget(key, fields);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<byte[]> hmget(byte[] key, byte[]... fields) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmget(key, fields);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String hmset(byte[] key, java.util.Map<byte[], byte[]> map) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmset(key, map);
		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String hmset(String key, java.util.Map<String, String> map) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hmset(key, map);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public java.util.Map<byte[], byte[]> hgetAll(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hgetAll(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long rpush(byte[] key, byte[]... args) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.rpush(key,args);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long lpush(byte[] key, byte[]... args) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.lpush(key,args);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public java.util.Map<String, String> hgetAll(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hgetAll(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hdel(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hdel(key, field);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hdel(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hdel(key, field);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hincrBy(String key, String field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, 1);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hincrBy(String key, String field, long value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hincrBy(byte[] key, byte[] field) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, 1);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hincrBy(byte[] key, byte[] field, long value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hincrBy(key, field, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Double hincrByFloat(byte[] key, byte[] field, double value) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.hincrByFloat(key,field,value);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public void set(byte[] key, byte[] value, int expirySeconds) {
		Jedis jedis = pool.getResource();
		try {
			jedis.set(key, value);
			jedis.expire(key, expirySeconds);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public void set(String key, String value, int expirySeconds) {
		Jedis jedis = pool.getResource();
		try {
			jedis.set(key, value);
			jedis.expire(key, expirySeconds);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long expire(String key, int seconds) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expire(key, seconds);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long expire(byte[] key, int seconds) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expire(key, seconds);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long pexpire(String key, long milliseconds) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pexpire(key,milliseconds);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long pexpire(byte[] key, long milliseconds) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pexpire(key,milliseconds);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long del(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.del(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long del(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.del(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public byte[] echo(byte[] arg) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.echo(arg);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long move(byte[] key, int dbIndex) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.move(key,dbIndex);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long bitcount(byte[] key) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.bitcount(key);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long bitcount(byte[] key, long start, long end) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.bitcount(key,start,end);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long pfadd(byte[] key, byte[]... elements) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pfadd(key,elements);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public long pfcount(byte[] key) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pfcount(key);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long ttl(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ttl(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long ttl(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ttl(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long expireAt(String key, long expireAt) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expireAt(key, expireAt);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long expireAt(byte[] key, long expireAt) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.expireAt(key, expireAt);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long pexpireAt(byte[] key, long millisecondsTimestamp) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.pexpireAt(key,millisecondsTimestamp);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Boolean getbit(String key, long offset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getbit(key, offset);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean getbit(byte[] key, long offset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getbit(key, offset);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String getrange(String key, long startOffset, long endOffset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getrange(key, startOffset, endOffset);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] getrange(byte[] key, long startOffset, long endOffset) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.getrange(key, startOffset, endOffset);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hsetnx(String key, String field, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hsetnx(key, field, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long hsetnx(byte[] key, byte[] field, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.hsetnx(key, field, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String lindex(String key, long index) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lindex(key, index);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long linsert(String key, LIST_POSITION where, String pivot, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.linsert(key, where, pivot, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<String> lrange(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrange(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<byte[]> lrange(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrange(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long lrem(String key, long count, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrem(key, count, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long lrem(byte[] key, long count, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lrem(key, count, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String lset(String key, long index, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lset(key, index, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String lset(byte[] key, long index, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.lset(key, index, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String ltrim(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ltrim(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String ltrim(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.ltrim(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long sadd(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sadd(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long sadd(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sadd(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long scard(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.scard(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long scard(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.scard(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean setbit(String key, long offset, boolean value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setbit(key, offset, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean setbit(byte[] key, long offset, boolean value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setbit(key, offset, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Boolean setbit(byte[] key, long offset, byte[] value) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.setbit(key,offset,value);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public String setex(String key, int seconds, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setex(key, seconds, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String setex(byte[] key, int seconds, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setex(key, seconds, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long setnx(String key, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setnx(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long setnx(byte[] key, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setnx(key, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long setrange(String key, long offset, String value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setrange(key, offset, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long setrange(byte[] key, long offset, byte[] value) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.setrange(key, offset, value);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean sismember(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sismember(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Boolean sismember(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sismember(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<String> smembers(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.smembers(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> smembers(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.smembers(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long srem(byte[] key, byte[]... member) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.srem(key,member);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public List<String> sort(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<byte[]> sort(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<String> sort(String key, SortingParams sortingParameters) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key, sortingParameters);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public List<byte[]> sort(byte[] key, SortingParams sortingParameters) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.sort(key, sortingParameters);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String spop(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.spop(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] spop(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.spop(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Set<byte[]> spop(byte[] key, long count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.spop(key,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public String srandmember(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srandmember(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] srandmember(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srandmember(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public List<byte[]> srandmember(byte[] key, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.srandmember(key,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long strlen(byte[] key) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.strlen(key);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long srem(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srem(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long srem(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.srem(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String substr(String key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.substr(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public byte[] substr(byte[] key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.substr(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String type(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.type(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public String type(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.type(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zadd(String key, double score, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zadd(key, score, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zadd(byte[] key, double score, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zadd(key, score, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long zadd(byte[] key, Map<byte[], Double> scoreMembers) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zadd(key,scoreMembers);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long zcard(String key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcard(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zcard(byte[] key) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcard(key);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zcount(String key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcount(key, min, max);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zcount(byte[] key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zcount(key, min, max);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long zcount(byte[] key, byte[] min, byte[] max) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zcount(key,min,max);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Double zincrby(String key, double score, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zincrby(key, score, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Double zincrby(byte[] key, double score, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zincrby(key, score, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<String> zrange(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrange(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> zrange(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrange(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long zrem(byte[] key, byte[]... member) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrem(key,member);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<String> zrangeByScore(String key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> zrangeByScore(byte[] key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Set<byte[]> zrangeByScore(byte[] key, byte[] min, byte[] max) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrangeByScore(key,min,max);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<String> zrangeByScore(String key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> zrangeByScore(byte[] key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScore(key, min, max, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Set<byte[]> zrevrangeByScore(byte[] key, byte[] max, byte[] min) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeByScore(key,max,min);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> zrangeByScore(byte[] key, byte[] min, byte[] max, int offset, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrangeByScore(key,min,max,offset,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min, double max) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min, double max, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeByScoreWithScores(key, min, max, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Set<byte[]> zrevrangeByScore(byte[] key, byte[] max, byte[] min, int offset, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeByScore(key,max,min,offset,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(byte[] key, byte[] min, byte[] max) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrangeByScoreWithScores(key,min,max);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, byte[] max, byte[] min) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeByScoreWithScores(key,max,min);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(byte[] key, byte[] min, byte[] max, int offset, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrangeByScoreWithScores(key,min,max,offset,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<Tuple> zrangeWithScores(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeWithScores(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrangeWithScores(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrangeWithScores(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Set<Tuple> zrevrangeWithScores(byte[] key, long start, long end) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeWithScores(key,start,end);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Long zrank(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrank(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zrank(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrank(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zrem(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrem(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zrem(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrem(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zremrangeByRank(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByRank(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zremrangeByRank(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByRank(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zremrangeByScore(String key, double start, double end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByScore(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zremrangeByScore(byte[] key, double start, double end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zremrangeByScore(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Long zremrangeByScore(byte[] key, byte[] start, byte[] end) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zremrangeByScore(key,start,end);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long zlexcount(byte[] key, byte[] min, byte[] max) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zlexcount(key,min,max);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> zrangeByLex(byte[] key, byte[] min, byte[] max) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrangeByLex(key,min,max);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> zrangeByLex(byte[] key, byte[] min, byte[] max, int offset, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrangeByLex(key,min,max,offset,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> zrevrangeByLex(byte[] key, byte[] max, byte[] min) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeByLex(key,max,min);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Set<byte[]> zrevrangeByLex(byte[] key, byte[] max, byte[] min, int offset, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeByLex(key,max,min,offset,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long zremrangeByLex(byte[] key, byte[] min, byte[] max) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zremrangeByLex(key,min,max);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long linsert(byte[] key, LIST_POSITION where, byte[] pivot, byte[] value) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.linsert(key,where,pivot,value);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long lpushx(byte[] key, byte[]... arg) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.lpushx(key,arg);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long rpushx(byte[] key, byte[]... arg) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.rpushx(key,arg);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public List<byte[]> blpop(byte[] arg) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.blpop(arg);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public List<byte[]> brpop(byte[] arg) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.brpop(arg);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<String> zrevrange(String key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrange(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> zrevrange(byte[] key, long start, long end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrange(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<String> zrevrangeByScore(String key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<String> zrevrangeByScore(String key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScore(key, max, min, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max, double min) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max, double min, int offset, int count) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeByScoreWithScores(key, max, min, offset, count);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, byte[] max, byte[] min, int offset, int count) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.zrevrangeByScoreWithScores(key,max,min,offset,count);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    public Set<Tuple> zrevrangeWithScores(String key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeWithScores(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Set<Tuple> zrevrangeWithScores(byte[] key, int start, int end) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrangeWithScores(key, start, end);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zrevrank(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrank(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Long zrevrank(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zrevrank(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Double zscore(String key, String member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zscore(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

	public Double zscore(byte[] key, byte[] member) {
		Jedis jedis = pool.getResource();
		try {
			return jedis.zscore(key, member);

		} finally {
			pool.returnResourceObject(jedis);
		}
	}

    @Override
    public void close() throws IOException {
        Jedis jedis = pool.getResource();
        try {
            jedis.close();
        } finally {
            pool.returnResourceObject(jedis);
        }
    }
}

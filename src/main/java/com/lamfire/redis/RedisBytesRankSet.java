package com.lamfire.redis;

import java.util.Set;

public class RedisBytesRankSet implements RankSet<byte[]>{
	private byte[] key;
	private RedisCli client;
	
	RedisBytesRankSet(byte[] key,RedisCli client){
		this.key = key;
		this.client = client;
	}

	@Override
	public void add(double score, byte[] val) {
		this.client.zadd(key, score, val);
	}

	@Override
	public long countWithScore(double min, double max) {
		return client.zcount(key, min, max);
	}

	@Override
	public long expire(int seconds) {
		return client.expire(key, seconds);
	}

	@Override
	public long expireAt(long expireAt) {
		return client.expireAt(key, expireAt);
	}

	@Override
	public double increase(double score, byte[] val) {
		return client.zincrby(key, score, val);
	}

	@Override
	public Set<byte[]> rangeByRank(long from, long to) {
		return client.zrevrange(key, from, to);
	}

	@Override
	public Set<byte[]> rangeByScore(double min, double max) {
		return client.zrevrangeByScore(key, min, max);
	}

	@Override
	public long rank(byte[] val) {
		return client.zrank(key, val);
	}

	@Override
	public void remove() {
		client.del(key);
	}

	@Override
	public void remove(byte[] member) {
		client.zrem(key, member);
	}

	@Override
	public void removeByScore(double from, double to) {
		client.zremrangeByScore(key, from, to);
	}

	@Override
	public double score(byte[] val) {
		return client.zscore(key, val);
	}

	@Override
	public Set<byte[]> top(long top) {
		return client.zrevrange(key, 0, top - 1);
	}

	@Override
	public long ttl() {
		return client.ttl(key);
	}
	
	@Override
	public byte[] max() {
		Set<byte[]> set = client.zrevrange(key, 0, 0);
		if(set==null || set.isEmpty()){
			return null;
		}
		return set.iterator().next();
	}

	@Override
	public byte[] min() {
		Set<byte[]> set = client.zrange(key, 0, 0);
		if(set==null || set.isEmpty()){
			return null;
		}
		return set.iterator().next();
	}
	
	@Override
	public Set<byte[]> revRangeByRank(long start, long end) {
		return client.zrange(key, start, end);
	}

	@Override
	public Set<byte[]> revRangeByScore(double start, double end) {
		return client.zrangeByScore(key, start, end);
	}
	
	@Override
	public Set<byte[]> max(long top) {
		return client.zrevrange(key, 0, top - 1);
	}

	@Override
	public Set<byte[]> min(long top) {
		return client.zrange(key, 0, top - 1);
	}
}

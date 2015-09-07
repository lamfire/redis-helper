package com.lamfire.redis;

import java.util.Set;

public class RedisStringRankSet implements RankSet<String>{
	private String key;
	private RedisCli client;
	
	RedisStringRankSet(String key,RedisCli client){
		this.key = key;
		this.client = client;
	}

	@Override
	public void add(double score, String val) {
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
	public double increase(double score, String val) {
		return client.zincrby(key, score, val);
	}

	@Override
	public Set<String> rangeByRank(long from, long to) {
		return client.zrevrange(key, from, to);
	}

	@Override
	public Set<String> rangeByScore(double from, double to) {
		return client.zrevrangeByScore(key, from, to);
	}

	@Override
	public long rank(String val) {
		return client.zrank(key, val);
	}

	@Override
	public void remove() {
		client.del(key);
	}

	@Override
	public void remove(String member) {
		client.zrem(key, member);
	}

	@Override
	public void removeByScore(double from, double to) {
		client.zremrangeByScore(key, from, to);
	}

	@Override
	public double score(String val) {
		return client.zscore(key, val);
	}

	@Override
	public Set<String> top(long top) {
		return client.zrevrange(key, 0, top - 1);
	}

	@Override
	public long ttl() {
		return client.ttl(key);
	}

	@Override
	public String max() {
		Set<String> set = client.zrevrange(key, 0, 0);
		if(set==null || set.isEmpty()){
			return null;
		}
		return set.iterator().next();
	}

	@Override
	public String min() {
		Set<String> set = client.zrange(key, 0, 0);
		if(set==null || set.isEmpty()){
			return null;
		}
		return set.iterator().next();
	}

	@Override
	public Set<String> revRangeByRank(long start, long end) {
		return client.zrange(key, start, end);
	}

	@Override
	public Set<String> revRangeByScore(double start, double end) {
		return client.zrangeByScore(key, start, end);
	}

	@Override
	public Set<String> max(long top) {
		return client.zrevrange(key, 0, top - 1);
	}

	@Override
	public Set<String> min(long top) {
		// TODO Auto-generated method stub
		return client.zrange(key, 0, top - 1);
	}
	
	
}

package com.lamfire.redis;

import java.util.Set;

public interface RankSet<E> {

	public void add(double score, E val);

	public Set<E> top(long top);
	
	public Set<E> min(long top);
	
	public Set<E> max(long top);
	
	public E min();
	
	public E max();
	
	public long rank(E val);
	
	public double score(E val);
	
	public long countWithScore(double min, double max);
	
	public double increase(double score, E val);
	
	public Set<E> rangeByRank(long start, long end);
	
	public Set<E> rangeByScore(double start, double end);
	
	public Set<E> revRangeByRank(long max, long min);
	
	public Set<E> revRangeByScore(double from, double to);
	
	public void remove();

	public void removeByScore(double min, double max);

	public void remove(E key);
	
	public long expire(int seconds);
	
	public long expireAt(long expireAt);
	
	public long ttl();
}

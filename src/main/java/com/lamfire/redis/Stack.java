package com.lamfire.redis;

public interface Stack<E> {

	public void push(E bytes);
	
	public E pop();
	
	public long size();
	
	public void expire(int seconds);
	
	public long expireAt(long expireAt);

	public long ttl();
	
}

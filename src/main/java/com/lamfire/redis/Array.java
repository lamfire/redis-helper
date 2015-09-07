package com.lamfire.redis;

import java.util.List;

public interface Array<E> {
	public void add(E e);

	public void set(int index, E bytes);

	public E get(int index);

	public List<E> range(int from, int to);
	
	public long size();

	public void expire(int seconds);
	
	public long expireAt(long expireAt);

	public long ttl();
	
	public void remove();
}

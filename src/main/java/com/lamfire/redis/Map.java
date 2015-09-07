package com.lamfire.redis;

import java.util.List;
import java.util.Set;

public interface Map<E> {

	public void put(E key, E val);
	
	public void putAll(java.util.Map<E, E> map);
	
	public E get(E key);
	
	public List<E> gets(E... keys);
	
	public long size();
	
	public long increase(E key);
	
	public long increase(E key, long step);
	
	public Set<E> keys();
	
	public List<E> values();
	
	public void remove(E key);
	
	public void expire(int seconds);
	
	public long expireAt(long expireAt);
	
	public long ttl();

	public void remove();
	
	public java.util.Map<E, E> getAll();
}

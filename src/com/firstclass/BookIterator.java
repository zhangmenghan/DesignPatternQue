package com.firstclass;

public interface BookIterator{
	public abstract boolean hasNext();
	public abstract Object next();
	public abstract boolean hasPrevious();
	public abstract Object previous();
}

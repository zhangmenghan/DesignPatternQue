package com.firstclass;

public class BookShelfIterator implements BookIterator{

	private BookShelf bookShelf;
	private int forwardIndex;
	private int backwordIndex;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.forwardIndex = 0;
		this.backwordIndex = bookShelf.getLength() - 1;
	}
	
	@Override
	public boolean hasNext() {
		if(forwardIndex < bookShelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(forwardIndex);
		forwardIndex++;
		return book;
	}

	@Override
	public boolean hasPrevious() {
		if(backwordIndex > -1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object previous() {
		Book book = bookShelf.getBookAt(backwordIndex);
		backwordIndex--;
		return book;
	}

}

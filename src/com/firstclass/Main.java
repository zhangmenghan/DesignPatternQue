package com.firstclass;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("A"));
		bookShelf.appendBook(new Book("B"));
		bookShelf.appendBook(new Book("C"));
		bookShelf.appendBook(new Book("D"));
		bookShelf.appendBook(new Book("E"));
		bookShelf.appendBook(new Book("F"));
		BookIterator it = (BookIterator) bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.print(book.getName());
		}
		System.out.println();
		while (it.hasPrevious()) {
			Book book = (Book) it.previous();
			System.out.print(book.getName());
		}
	}
}

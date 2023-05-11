package com.hccs.advweb;

import java.util.ArrayList;

public interface BookService {
	public void addBook(Book book);
	public Book getBook(int Id);
	public ArrayList<Book> getBooksList();
	public Book updateBook(Book book);
}

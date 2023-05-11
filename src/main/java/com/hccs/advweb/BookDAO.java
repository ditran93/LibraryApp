package com.hccs.advweb;

import java.util.ArrayList;

public interface BookDAO {
	public void addBook(Book book);
	public ArrayList<Book> getBooksList();
	public Book getBook(int Id);
	public Book updateBook(Book book);
}

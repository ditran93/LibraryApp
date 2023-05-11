package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addBook(Book book) {
		bookDAO.addBook(book);		
	}

	@Override
	@Transactional
	public ArrayList<Book> getBooksList() {
		return bookDAO.getBooksList();
	}

	@Override
	@Transactional
	public Book getBook(int Id) {
		return bookDAO.getBook(Id);
	}

	@Override
	@Transactional
	public Book updateBook(Book book) {
		return bookDAO.updateBook(book);
	}
	
	

}


package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBook(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Book> getBooksList() {
		ArrayList<Book> studentsList = 
				(ArrayList<Book>)sessionFactory.
				getCurrentSession().createQuery("FROM Student").
				list();
		return studentsList;
	}

	@Override
	public Book getBook(int Id) {
		Book student = (Book)sessionFactory.getCurrentSession().get(Book.class, Id);
		return student;
	}

	@Override
	public Book updateBook(Book book) {
		
		return null;
	}

}
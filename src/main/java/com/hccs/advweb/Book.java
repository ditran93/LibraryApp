package com.hccs.advweb;
import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BOOK")
public class Book {
	
	@Id
	@Column(name="ID")
	private int ID;
	@Column(name="ISBN")
	private String ISBN;
	@Column(name="AUTHOR")
	private String author;
	@Column(name="GENRE")
	private String genre;
	@Column(name="TITLE")
	private String title;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Book(int ID, String ISBN, String author, String genre, String title) {
		this.ID = ID;
		this.ISBN = ISBN;
		this.author = author;
		this.genre = genre;
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public void Student(int id, String ISBN, String author, String genre, String title) {
		setID(id);
		setISBN(ISBN);
		setAuthor(author);
		setGenre(genre);
		setTitle(title);
	}

	@Override
	public String toString() {
		return "Book [id=" + ID + ", ISBN=" + ISBN + ", author=" + author + ", genre=" + genre + ", title="
				+ title + "]";
	}
}

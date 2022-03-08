package com.mini.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="book_details") 
public class Book {

	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id") 
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_author")
	private String bookAuthor;
	
	@Column(name="book_cost")
	private int bookCost;
	
	@Column(name="book_removed")
	private boolean bookRemoved;

	
	public Book() {
		super();
	}

	public Book(int bookId, String bookTitle, String bookGenre, String bookAuthor, int bookCost, boolean bookRemoved) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.bookRemoved = bookRemoved;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public boolean isBookRemoved() {
		return bookRemoved;
	}

	public void setBookRemoved(boolean bookRemoved) {
		this.bookRemoved = bookRemoved;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookGenre=" + bookGenre + ", bookAuthor="
				+ bookAuthor + ", bookCost=" + bookCost + ", bookRemoved=" + bookRemoved + "]";
	}
}
package com.mini.project.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BookPojo {


	
	private int bookId;
	
	@NotNull
	private String bookTitle;
	
	@NotNull
	private String bookGenre;
	
	@NotNull
	private String bookAuthor;
	
	@Min(0)
	private int bookCost;
	
	private boolean bookRemoved;
	
	private String bookImage;
	
	


	public BookPojo(int id, String bookTitle, String bookGenre, String bookAuthor, int bookCost, boolean bookRemoved,
			String bookImage) {
		super();
		this.bookId = id;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.bookRemoved = bookRemoved;
		this.bookImage = bookImage;
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



	public String getBookImage() {
		return bookImage;
	}



	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	

}

	
	


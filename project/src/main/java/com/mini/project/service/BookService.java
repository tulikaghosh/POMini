package com.mini.project.service;

import java.util.List;

import com.mini.project.exception.ApplicationException;
import com.mini.project.pojo.BookPojo;



public interface BookService {
	BookPojo addBook(BookPojo bookPojo) throws ApplicationException;
	boolean deleteBook(int bookId) throws ApplicationException;
	void exitApplication(); 
}

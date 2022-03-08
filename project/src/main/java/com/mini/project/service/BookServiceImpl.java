package com.mini.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.project.dao.BookRepositoryDao;
import com.mini.project.entity.Book;
import com.mini.project.exception.ApplicationException;
import com.mini.project.pojo.BookPojo;


//@Component
@Service
@Transactional 
public class BookServiceImpl implements BookService{

	@Autowired
	
	BookRepositoryDao bookRepositoryDao;
	
	public BookServiceImpl() {
		
	}
  
	@Override
	public BookPojo addBook(BookPojo bookPojo) throws ApplicationException {
		
		Book newBook = new Book(bookPojo.getBookId(), bookPojo.getBookTitle(), bookPojo.getBookGenre(), bookPojo.getBookAuthor(), bookPojo.getBookCost(), bookPojo.isBookRemoved());
		Book returnBook = bookRepositoryDao.saveAndFlush(newBook);
		bookPojo.setBookId(returnBook.getBookId());
		
		return bookPojo;
	}

	@Override
	public boolean deleteBook(int bookId) throws ApplicationException {
		
		this.bookRepositoryDao.deleteById(bookId);
		return true;
	}
	@Override
	public void exitApplication() {
		
	}

	
}



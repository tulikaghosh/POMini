package com.mini.project.controller;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.project.exception.ApplicationException;
import com.mini.project.pojo.BookPojo;
import com.mini.project.service.BookService;




@RestController
@RequestMapping("api") 
public class BookController {

	
	
	@Autowired 
	BookService bookService;
	
	//http://localhost:7777/api/books
	@PostMapping("books")
	BookPojo addBook(@Valid @RequestBody BookPojo bookPojo) throws ApplicationException{
		return bookService.addBook(bookPojo);
	}
	
	@DeleteMapping("books/{bid}")
	boolean deleteBook(@PathVariable("bid") int bookId) throws ApplicationException{
		return bookService.deleteBook(bookId);
	}

}

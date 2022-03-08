package com.mini.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.project.entity.Book;



@Repository
public interface BookRepositoryDao extends JpaRepository<Book, Integer> {

	List<Book> findByBookGenre(String bookGenre);
	List<Book> findByBookGenreAndBookCostGreaterThan(String bookGenre, int bookCost);
}

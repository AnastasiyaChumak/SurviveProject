package com.Diplom.services;

import java.util.List;

import com.Diplom.entity.Book;

public interface BookService {
	public Book createBook(Book book);

	public List<Book> findAll();

	public List<Book> findByTopicSearch(String topic);

	public Book findById(Integer i);

	public Book saveBook(Book newBook);

	public void deleteBook(Book book);
}

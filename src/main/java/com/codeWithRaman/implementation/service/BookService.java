package com.codeWithRaman.implementation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeWithRaman.implementation.model.Book;

@Service
public class BookService {

	private final List<Book> books = List.of(
			new Book("1", "Spring boot in action", "Craig")
			,new Book("2", "GraphQL for beginners ", "John"),
			new Book("3", "Java 21 explained", "Jane Smith"));

	
	public List<Book> getAllBooks(){
		return books;
	}
	
	public Book getBookById(String id) {
		return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
	}
}

package com.codeWithRaman.implementation.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.codeWithRaman.implementation.model.Book;
import com.codeWithRaman.implementation.service.BookService;

@Controller
public class BookResolver {

	private final BookService bookService;

	public BookResolver(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@QueryMapping
	public List<Book> allBooks(){
		return bookService.getAllBooks();
	}
	
	@QueryMapping
	public Book bookById(@Argument String id) {
		return bookService.getBookById(id);
	}
}

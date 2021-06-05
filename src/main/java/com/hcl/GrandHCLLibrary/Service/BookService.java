package com.hcl.GrandHCLLibrary.Service;

import java.util.List;

import com.hcl.GrandHCLLibrary.Entity.Book;

public interface BookService {

	public Book addBoook(Book book);

	public Book getBookById(Long id);
	
	public List<Book> getAllBooks();

	public Book updateBoook(Book book, long uuid);


}

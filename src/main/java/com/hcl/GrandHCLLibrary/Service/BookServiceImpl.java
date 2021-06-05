package com.hcl.GrandHCLLibrary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.GrandHCLLibrary.Entity.Book;
import com.hcl.GrandHCLLibrary.Exception.BookException;
import com.hcl.GrandHCLLibrary.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBoook(Book book) {
		if(book.getTitle().isEmpty() || book.getAuthor().isEmpty() || book.getEdition().isEmpty()) {
			throw new BookException("601","All fields must be filled.");
		}
		try {		
			Book bookAdd = bookRepository.save(book);
			return bookAdd;
		}catch(IllegalArgumentException e) {

			throw new BookException("602","You can't pass book attributes as null."+e.getMessage());
		}catch(Exception e) {

			throw new BookException("603","Something went wrong in service layer."+e.getMessage());
		}
	}
}

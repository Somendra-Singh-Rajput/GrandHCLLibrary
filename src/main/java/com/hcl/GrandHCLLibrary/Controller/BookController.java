package com.hcl.GrandHCLLibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.GrandHCLLibrary.Entity.Book;
import com.hcl.GrandHCLLibrary.Exception.BookControllerException;
import com.hcl.GrandHCLLibrary.Exception.BookException;
import com.hcl.GrandHCLLibrary.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addBook(@RequestBody Book book){	
		try {
			Book book1 = bookService.addBoook(book);		
			return new ResponseEntity<Book>(book1,HttpStatus.CREATED);
		}catch(BookException e) {
			BookControllerException bce = new BookControllerException(e.getErrorCode(),e.getErrorMessage());
			return new ResponseEntity<BookControllerException>(bce,HttpStatus.CREATED);
		}catch(Exception e) {
			BookControllerException bce = new BookControllerException("603","Something is wrong with book controller.");
			return new ResponseEntity<BookControllerException>(bce,HttpStatus.CREATED);
		}
	}
	
}

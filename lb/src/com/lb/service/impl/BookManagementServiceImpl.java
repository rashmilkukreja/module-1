package com.lb.service.impl;

import java.util.HashMap;

import com.lb.model.Book;
import com.lb.model.User;
import com.lb.repo.BookRepo;
import com.lb.service.BookManagementService;

public class BookManagementServiceImpl implements BookManagementService{
	BookRepo bookrepo;
	
	
	public BookManagementServiceImpl() {
		bookrepo =new BookRepo();
	}


	@Override
	public void addNewBook(Book book) {
		HashMap<Integer,Book> x=bookrepo.getbookmap();
		x.put(book.getBookId(), book);
		bookrepo.setBookdata(x);
		
		
	}


	@Override
	public void printBook() {
		HashMap<Integer,Book> bookmap=bookrepo.getbookmap();
		for(Book book:bookmap.values()) {
			System.out.println(book);
		}
		
	}

}


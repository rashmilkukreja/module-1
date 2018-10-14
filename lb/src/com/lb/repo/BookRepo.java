package com.lb.repo;

import java.util.HashMap;

import com.lb.model.Book;

public class BookRepo {
	HashMap<Integer,Book> bookmap=new HashMap<>();

	public HashMap<Integer, Book> getbookmap() {
		return bookmap;
	}

	public void setBookdata(HashMap<Integer, Book> bookmap) {
		this.bookmap = bookmap;
	}
	

}

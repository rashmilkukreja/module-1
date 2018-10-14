package com.lb.service;

import com.lb.exception.CustomException;
import com.lb.model.Book;

public interface LibraryService {
	
	public void addBookCount(Book book,int count);
	public void issuebook(Book book,int userId) throws CustomException;
	public void returnBook(Book book, Integer userId) throws CustomException;

}

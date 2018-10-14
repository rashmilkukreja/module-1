package com.lb;

import com.lb.enums.UserType;
import com.lb.exception.CustomException;
import com.lb.model.Book;
import com.lb.model.User;
import com.lb.service.BookManagementService;
import com.lb.service.LibraryService;
import com.lb.service.UserMangementService;
import com.lb.service.impl.BookManagementServiceImpl;
import com.lb.service.impl.LibraryServiceImpl;
import com.lb.service.impl.UserManagementServiceImpl;

public class ApplicationMain {

	public static void main(String[] args) throws CustomException {
		
		UserMangementService usersevice=new UserManagementServiceImpl();
		User u=new User(1,"ram",UserType.librarion,"b.tech");
		usersevice.addUser(u);
		
		
		User uu1=new User(2,"shyam",UserType.student,"b.tech");
		usersevice.addUser(uu1);
		
		usersevice.printUsers();
		
		
		BookManagementService bookservice=new BookManagementServiceImpl();
		Book b=new Book(1, "xyz", "300");
		bookservice.addNewBook(b);
		bookservice.printBook();
		
		LibraryService libservice=new LibraryServiceImpl();
		libservice.addBookCount(b, 10);
		libservice.issuebook(b, 2);
		
		
		
		libservice.returnBook(b, 2);
	}

}

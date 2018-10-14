package com.lb.repo;

import java.util.HashMap;

import com.lb.model.BookIssueDetail;

public class LibraryRepo {
	
	HashMap<Integer,BookIssueDetail> librarymap= new HashMap();

	public HashMap<Integer, BookIssueDetail> getLibrarymap() {
		return librarymap;
	}

	public void setLibrarymap(HashMap<Integer, BookIssueDetail> librarymap) {
		this.librarymap = librarymap;
	}
	
	

}

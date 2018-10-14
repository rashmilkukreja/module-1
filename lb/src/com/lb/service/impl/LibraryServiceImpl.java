package com.lb.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.lb.exception.CustomException;
import com.lb.model.Book;
import com.lb.model.BookIssueDetail;
import com.lb.repo.LibraryRepo;
import com.lb.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {

	LibraryRepo librepo;
	private List<Integer> userIdList;

	public LibraryServiceImpl() {
		librepo = new LibraryRepo();
	}

	@Override
	public void addBookCount(Book book, int count) {
		HashMap<Integer, BookIssueDetail> libmap = librepo.getLibrarymap();

		BookIssueDetail bookIssueDetail;
		if (libmap.containsKey(book.getBookId())) {
			bookIssueDetail = libmap.get(book.getBookId());
			int availaibleCount = bookIssueDetail.getAvailaibleCount();
			availaibleCount += count;
			bookIssueDetail.setAvailaibleCount(availaibleCount);
		} else {
			bookIssueDetail = new BookIssueDetail(book.getBookId(), count, 0, new ArrayList<Integer>());

		}
		libmap.put(book.getBookId(), bookIssueDetail);
		librepo.setLibrarymap(libmap);
	}

	@Override
	public void issuebook(Book book, int userId) throws CustomException {
		HashMap<Integer, BookIssueDetail> libmap = librepo.getLibrarymap();
		BookIssueDetail bookIssueDetail;
		if (!libmap.containsKey(book.getBookId())) {
			throw new CustomException("book not present in library");
		} else {
			bookIssueDetail = libmap.get(book.getBookId());
			int availaibleCount = bookIssueDetail.getAvailaibleCount();
			if (availaibleCount <= 0) {
				throw new CustomException("All books are issued");
			} else {
				availaibleCount-=1;
				int issueCount = bookIssueDetail.getIssueCount();
				issueCount+=1;
				userIdList = bookIssueDetail.getUserIdList();
				userIdList.add(userId);
				System.out.println(userId);
				bookIssueDetail.setAvailaibleCount(availaibleCount);
				bookIssueDetail.setIssueCount(issueCount);
				bookIssueDetail.setUserIdList(userIdList);
				libmap.put(book.getBookId(), bookIssueDetail);
				librepo.setLibrarymap(libmap);
			}
		}
	}

	@Override
	public void returnBook(Book book, Integer userId) throws CustomException {
		HashMap<Integer, BookIssueDetail> libmap = librepo.getLibrarymap();
		BookIssueDetail bookIssueDetail;
		if (!libmap.containsKey(book.getBookId())) {
			throw new CustomException("book not of library");
		} else {
			bookIssueDetail = libmap.get(book.getBookId());
			int availaibleCount = bookIssueDetail.getAvailaibleCount();
			int issueCount = bookIssueDetail.getIssueCount();
			issueCount -=1;
			availaibleCount+=1;
			userIdList = bookIssueDetail.getUserIdList();
			userIdList.remove(userId);
			System.out.println(userId);
			bookIssueDetail.setAvailaibleCount(availaibleCount);
			bookIssueDetail.setIssueCount(issueCount);
			bookIssueDetail.setUserIdList(userIdList);
			libmap.put(book.getBookId(), bookIssueDetail);
			librepo.setLibrarymap(libmap);
		
		}
	}

}

package com.lb.model;

import java.util.List;

public class BookIssueDetail {
	
	private int bookId;
 private int availaibleCount;
 private int issueCount;
 private List<Integer> userIdList;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public int getAvailaibleCount() {
	return availaibleCount;
}
public void setAvailaibleCount(int availaibleCount) {
	this.availaibleCount = availaibleCount;
}
public int getIssueCount() {
	return issueCount;
}
public void setIssueCount(int issueCount) {
	this.issueCount = issueCount;
}
public List<Integer> getUserIdList() {
	return userIdList;
}
public void setUserIdList(List<Integer> userIdList) {
	this.userIdList = userIdList;
}
public BookIssueDetail(int bookId, int availaibleCount, int issueCount, List<Integer> userIdList) {
	
	this.bookId = bookId;
	this.availaibleCount = availaibleCount;
	this.issueCount = issueCount;
	this.userIdList = userIdList;
}
public BookIssueDetail() {
	
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BookIssueDetail [bookId=" + bookId + ", availaibleCount=" + availaibleCount + ", issueCount=" + issueCount
			+ ", userIdList=" + userIdList + "]";
}
 
 
 
 
}

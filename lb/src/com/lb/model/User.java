package com.lb.model;

import com.lb.enums.UserType;

public class User {
	private int userId;
	private String name;
	private UserType type;
	private String course;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public User(int userId, String name, UserType type, String course) {
		
		this.userId = userId;
		this.name = name;
		this.type = type;
		this.course = course;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", type=" + type + ", course=" + course + "]";
	}
	public User() {
		
	}
	
	
	

}

package com.lb.repo;

import java.util.HashMap;

import com.lb.model.User;

public class UserRepo {
	
	
	HashMap<Integer,User>  usermap=new HashMap<>();

	public HashMap<Integer, User> getUsermap() {
		return usermap;
	}

	public void setUsermap(HashMap<Integer, User> usermap) {
		this.usermap = usermap;
	}
	

}

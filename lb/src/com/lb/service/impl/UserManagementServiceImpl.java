package com.lb.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.lb.model.User;
import com.lb.repo.UserRepo;
import com.lb.service.UserMangementService;

public class UserManagementServiceImpl implements UserMangementService{
	
	UserRepo userrepo;
	
	public UserManagementServiceImpl() {
		userrepo=new UserRepo();
	}

	@Override
	public void addUser(User user) {
		HashMap<Integer, User> usermap = userrepo.getUsermap();
		usermap.put(user.getUserId(), user);
		userrepo.setUsermap(usermap);
		
	}

	@Override
	public void printUsers() {
		HashMap<Integer, User> usermap = userrepo.getUsermap();
		
		for(User user:usermap.values()) {
			System.out.println(user);
		}
		
		
	}

}

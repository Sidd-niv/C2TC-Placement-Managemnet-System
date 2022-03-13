package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.User;

public interface IUserService {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public User login(String user, String password);
	
	public void logOut();

}

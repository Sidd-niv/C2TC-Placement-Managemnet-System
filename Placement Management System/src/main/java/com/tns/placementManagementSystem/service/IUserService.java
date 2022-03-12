package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.User;

public interface IUserService {
	
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();

}

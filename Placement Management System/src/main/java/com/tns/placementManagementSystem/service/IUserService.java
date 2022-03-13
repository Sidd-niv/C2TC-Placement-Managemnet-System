package com.tns.placementManagementSystem.service;

import java.util.List;

import com.tns.placementManagementSystem.entities.User;

public interface IUserService {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public List<String> login(String user, String password);
	
	public void logOut();

}

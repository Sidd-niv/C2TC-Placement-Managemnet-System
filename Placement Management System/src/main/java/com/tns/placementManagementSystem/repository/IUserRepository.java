package com.tns.placementManagementSystem.repository;

import java.util.List;

import com.tns.placementManagementSystem.entities.User;

public interface IUserRepository {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(long id);
	
	public List<String> login(String userName, String password);
	
    public void beginTrancsaction();
	
	public void commitTransaction();

}

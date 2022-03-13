package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.User;

public interface IUserRepository {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(long id);
	
	public User login(User user);
	
    public void beginTrancsaction();
	
	public void commitTransaction();

}

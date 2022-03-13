package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.User;
import com.tns.placementManagementSystem.repository.IUserRepository;
import com.tns.placementManagementSystem.repository.UserRepositoryImp;

public class UserServiceImp implements IUserService {

	private IUserRepository dao;
	
	public UserServiceImp() {
		dao = new UserRepositoryImp();
	}

	@Override
	public void addUser(User user) {
		dao.beginTrancsaction();
		dao.addUser(user);
		dao.commitTransaction();
		
	}

	@Override
	public void updateUser(User user) {
		dao.beginTrancsaction();
		dao.updateUser(user);
		dao.commitTransaction();
		
	}

	@Override
	public userLogin(String user, String password) {
		
		return null;
	}

	@Override
	public void logOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User login(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

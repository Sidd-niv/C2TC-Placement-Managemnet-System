package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.User;
import javax.persistence.EntityManager; 

public class UserRepositoryImp implements IUserRepository{

	private EntityManager entityManager;
	
	public UserRepositoryImp() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
	}

	@Override
	public void deleteUser(long id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void beginTrancsaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}

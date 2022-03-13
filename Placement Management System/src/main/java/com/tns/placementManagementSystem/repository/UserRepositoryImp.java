package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.User;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery; 

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
	public List<String> login(String userName, String password) {
		String queryString = "SELECT u.uName, u.uPassword FROM user u where u.uName= :uname AND u.uPassword = :upass";
		TypedQuery<String> query = entityManager.createQuery(queryString, String.class);
		query.setParameter("uname", userName);
		query.setParameter("upass", password);
		List<String> userDetials = query.getResultList();
		return userDetials;
	}
	


}

package com.tns.placementManagementSystem.repository;

import javax.persistence.EntityManager;
import com.tns.placementManagementSystem.entities.College;

public class CollegeRepositoryImp implements ICollegeRepository {

	private EntityManager entityManager;
	
	public CollegeRepositoryImp() {
		entityManager  = JPAUtil.getEntityManager();
	}

	@Override
	public void addCollege(College college) {
		entityManager.persist(college);
	}

	@Override
	public void updateCollege(College college) {
		entityManager.merge(college);
	}

	@Override
	public College searchCollege(String college) {
		College col = entityManager.find(College.class, college);
		return col;
	}

	@Override
	public void deleteCollege(long id) {
		College col = entityManager.find(College.class, id);
		entityManager.remove(col);
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public College findCollegeById(Long id) {
		College col = entityManager.find(College.class, id);
		return col;
	}

}

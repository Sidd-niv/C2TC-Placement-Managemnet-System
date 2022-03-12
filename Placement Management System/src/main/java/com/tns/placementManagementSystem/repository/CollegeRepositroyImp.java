package com.tns.placementManagementSystem.repository;

import javax.persistence.EntityManager;
import com.tns.placementManagementSystem.entities.College;

public class CollegeRepositroyImp implements ICollegeRepository {

	private EntityManager entityManager;
	
	public CollegeRepositroyImp() {
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

}

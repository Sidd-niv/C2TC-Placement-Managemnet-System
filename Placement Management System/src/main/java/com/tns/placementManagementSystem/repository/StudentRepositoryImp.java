package com.tns.placementManagementSystem.repository;

import javax.persistence.EntityManager;

import com.tns.placementManagementSystem.entities.*;


public class StudentRepositoryImp implements IStudentRepository{
	
	private EntityManager entityManager;
	
	public StudentRepositoryImp() 
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) 
	{
		entityManager.persist(student);
	}

	@Override
	public void updateStudent(Student student) 
	{
		entityManager.merge(student);
		
	}

	@Override
	public Student searchStudentById(long id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) 
	{
		Student student = entityManager.find(Student.class, ticketNo);
		return student;
	}

	@Override
	public void deleteStudent(long id)
	{
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	
	}

	@Override
	public void beginTrancsaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	
	

}

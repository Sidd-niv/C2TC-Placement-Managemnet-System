package com.tns.placementManagementSystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tns.placementManagementSystem.entities.*;


public class StudentRepositoryImp implements IStudentRepository{
	
	// Declaring the EntityManager instance variable
	private EntityManager entityManager;
	
	public StudentRepositoryImp() 
	{
		entityManager = JPAUtil.getEntityManager();
	}

	
	// Create method
	@Override
	public void addStudent(Student student) 
	{
		entityManager.persist(student);
	}

	
	// Update operation 
	@Override
	public void updateStudent(Student student) 
	{
		entityManager.merge(student);
		
	}

	// 
	@Override
	public Student searchStudentById(long id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public String searchStudentByHallTicket(long ticketNo) 
	{
		String queryString = "select s.name from Student s where s.hallTicketNo =: hall";
		TypedQuery<String> query = entityManager.createQuery(queryString, String.class);
		query.setParameter("hall", ticketNo);
		String hallInfo = query.getSingleResult();
		return hallInfo;
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

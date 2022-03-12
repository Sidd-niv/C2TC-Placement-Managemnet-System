package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.Student;

public interface IStudentRepository {

	public void addStudent(Student student);
	
	public void updateStudent(Student student);
	
	public Student searchStudentById(long id);
	
	public Student searchStudentByHallTicket(long ticketNo);
	
	public void deleteStudent(long id);

	public void beginTrancsaction();
	
	public void commitTransaction();
}

package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.Student;


public interface IStudentService {
	
	public void addStudent(Student student);
	
	public void updateStudent(Student student); 
	
	public Student searchStudentById(long id);  

	public Student searchStudentByHallTicket(long id); 

	public void deleteStudent(long id); 

}

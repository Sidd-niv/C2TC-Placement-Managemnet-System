package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.Student;


public interface IStudentService {
	
	public Student addStudent(Student student);  // C
	public Student updateStudent(Student student);  // U
	public Student searchStudentById(long id);  // R

	public Student searchStudentByHallTicket(long id); // R

	public Certificate addCertificate(Certificate certificate); // C
	public Certificate updateCertificate(Certificate certificate); // U
	public boolean deleteStudent(long id); // D

}

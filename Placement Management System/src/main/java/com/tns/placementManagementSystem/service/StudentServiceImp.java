package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.repository.IStudentRepository;
import com.tns.placementManagementSystem.repository.StudentRepositoryImp;
import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.Student;

public class StudentServiceImp implements IStudentService{
	
	private IStudentRepository dao;

	public StudentServiceImp() 
	{
		dao = new StudentRepositoryImp();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTrancsaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTrancsaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student searchStudentById(long id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long id) {
		Student student = dao.searchStudentByHallTicket(id);
		return student;
	}



	@Override
	public void deleteStudent(long id) {
		dao.beginTrancsaction();
		dao.deleteStudent(id);
		dao.commitTransaction();
		
	}

}

package com.tns.placementManagementSystem.clients;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.service.IStudentService;
import com.tns.placementManagementSystem.service.StudentServiceImp;

public class TestApp {

	
	public static void main(String[] args) {
//		
//		Student student = new Student();
//		Certificate certi = new Certificate();
//		College college = new  College();
//		IStudentService ser = new StudentServiceImp();
//		
//		
//		
//		student.setId(1L);
//		student.setName("Suraj");
//		student.setCollegeName("Pillai");
//		student.setCourse("EXTC");
//		student.setHallTicketNo(46455L);
//		student.setQualification("B.E");
//		student.setRoll(1L);
//		
//		certi.setC_id(1);
//		certi.setCollegeName(student.getCollegeName());
//		certi.setYear(2021L);
//		student.setCertificate(certi);
//		
//		college.setC_id(3);
//		college.setCollegeAdmin("XYZ");
//		college.setCollegeName("Pillai");
//		college.setLocation("Mumbai");
//		
//		student.setCollege_id(college);
//		
//		ser.addStudent(student);
//		
		
		PlacementManagementSystemClientApp system = new PlacementManagementSystemClientApp();
//		
//		
		system.addStudentData("Aditya", 1L, "Extc", "Pillai", 4524566L, 1L, "B.E", 1L, 2021L);
		system.addCollegeData(1L, "XYZ", "xyzz", "Location", 1L);
		system.saveStudentData();
		System.out.println("Done");
		
		
		
		
	
		
		
		
		
		
		

	}

}

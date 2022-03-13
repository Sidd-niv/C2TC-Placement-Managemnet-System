package com.tns.placementManagementSystem.clients;

import com.tns.placementManagementSystem.entities.*;
import com.tns.placementManagementSystem.service.*;

public class PlacementManagementSystemClientApp {
	
	private Student student;
	private Certificate certi;
	private College college;
	private User user;
	private Placement placement;
	
	private IStudentService studentService;
	private ICollegeService coser;
	private IUserService userService;

	public PlacementManagementSystemClientApp() 
	{
		student = new Student();
		certi = new Certificate();
		college = new  College();
		user = new User();
		placement = new Placement();
		studentService = new StudentServiceImp();
		userService = new UserServiceImp();
		
	}
	
	
	public void addStudentData(String name, Long id, String couserName, String collName, Long hallTicket, Long roll, String qual, Long certId, Long year)
	{
		student.setId(id);
		student.setName(name);
		student.setCourse(couserName);
		student.setCollegeName(collName);
		student.setHallTicketNo(hallTicket);
		student.setRoll(roll);
		student.setQualification(qual);
		
		certi.setC_id(certId);
		certi.setCollegeName(collName);
		certi.setYear(year);
		
		student.setCertificate(certi);
		
	}
	
	public void addCollegeData(Long collId, String adminName, String collName, String loc, Long uid)
	{
		college.setC_id(collId);
		college.setCollegeAdmin(adminName);
		college.setCollegeName(collName);
		college.setLocation(loc);
		college.setU_id(uid);
		student.setCollege_id(college);
		
		
		
		
	}
	
	public void saveStudentData() 
	{
		studentService.addStudent(student);
	    
	}
	
	public void registerUser(Long userid, String userName, String userPass, String userType)
	{
		user.setUser_id(userid);
		user.setuName(userName);
		user.setuPassword(userPass);
		user.setuType(userType);
	}
	
}

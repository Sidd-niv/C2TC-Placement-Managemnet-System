package com.tns.placementManagementSystem.clients;

import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Placement;
import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.entities.User;
import com.tns.placementManagementSystem.service.CollegeServiceImp;
import com.tns.placementManagementSystem.service.ICollegeService;
import com.tns.placementManagementSystem.service.IPlacementService;
import com.tns.placementManagementSystem.service.IStudentService;
import com.tns.placementManagementSystem.service.IUserService;
import com.tns.placementManagementSystem.service.PlacementServiceImp;
import com.tns.placementManagementSystem.service.StudentServiceImp;
import com.tns.placementManagementSystem.service.UserServiceImp;

public class PlacementManagementSystemReadAppTest {

	public static void main(String[] args) {
		
		// Defining the required service package class objects
		IStudentService studentService = new StudentServiceImp();
		ICollegeService collegeService = new CollegeServiceImp();
		IPlacementService placeService = new PlacementServiceImp();
		IUserService userService       = new UserServiceImp();
		
		
		// Defining Student class object
		Student student = new Student();
		
		student = studentService.searchStudentById(1);
		System.out.println(student.getName());
		
//		String Name = studentService.searchStudentByHallTicket(4211345);
//		System.out.println(Name);
//		College college = new College();
//		college = collegeService.findCollegeById(null);

		
//		Placement placement = new Placement();
//		placement = placeService.searchPlacement(1);
//		System.out.println(placement.getCollegeName());
	
//		User user = new User();
//		user = userService.findUserById(null);

	}

}

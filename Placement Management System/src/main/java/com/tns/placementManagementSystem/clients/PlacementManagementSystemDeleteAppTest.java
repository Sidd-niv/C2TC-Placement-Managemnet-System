package com.tns.placementManagementSystem.clients;

import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.service.CollegeServiceImp;
import com.tns.placementManagementSystem.service.ICollegeService;
import com.tns.placementManagementSystem.service.IPlacementService;
import com.tns.placementManagementSystem.service.IStudentService;
import com.tns.placementManagementSystem.service.IUserService;
import com.tns.placementManagementSystem.service.PlacementServiceImp;
import com.tns.placementManagementSystem.service.StudentServiceImp;
import com.tns.placementManagementSystem.service.UserServiceImp;

public class PlacementManagementSystemDeleteAppTest {

	public static void main(String[] args) {
		
		IStudentService studentService = new StudentServiceImp();
		ICollegeService collegeService = new CollegeServiceImp();
		IPlacementService placeService = new PlacementServiceImp();
		IUserService userService       = new UserServiceImp();

		
		studentService.deleteStudent(4);
//		collegeService.deleteCollege(0);
//		placeService.cancelPlacement(0);
		System.out.println("Done");
		
	}

}
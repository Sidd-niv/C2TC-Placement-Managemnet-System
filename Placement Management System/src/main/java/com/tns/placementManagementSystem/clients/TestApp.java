package com.tns.placementManagementSystem.clients;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.service.IStudentService;
import com.tns.placementManagementSystem.service.StudentServiceImp;

public class TestApp {

	
	public static void main(String[] args) {

//		
		
		PlacementManagementSystemCreateAppTest system = new  PlacementManagementSystemCreateAppTest();
		
		
		system.addStudentData("Vipul", 4L, "Extc", "Pillai", 42568345L, 4L, "B.E", 4L, 2021L);
		system.addCollegeData(4L, "XYZ2", "xyzz1", "Mumbai", 4L);
		system.saveStudentData();
		
//		College col = new College();
//		col.setC_id(1);
//		system.addPlacementData(4L, "3 Dec 2021", "CG", "B.E", "Pillai",2021L);
//		system.savePlacementData();
//		System.out.println("Done");
//		
		
		
		
	
		
		
		
		
		
		

	}

}

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
		
//		String name, Long id, String couserName, String collName, Long hallTicket, Long roll, String qual, Long certId, Long year
		system.addStudentData("Siddhant", 3L, "Extc", "Pillai", 103L, 3L, "B.E", 3L, 2021L);
		
		
//		Long collId, String adminName, String collName, String loc, Long uid
		system.addCollegeData(3L, "XYZ1", "xyzz1", "Mumbai", 1L);
		system.saveStudentData();
//		
//		System.out.println("Done");
		
//		College col = new College();
//		col.setC_id(2);
//		
//		Long pid, String date, String pname, String qual, String pcol,Long year
//		system.addPlacementData(2L, "3 Dec 2021", "TCS", "B.E", "Pillai",2021L);
//		system.savePlacementData();
//		System.out.println("Done");
		
		
		
		
	
		
		
		
		
		
		

	}

}

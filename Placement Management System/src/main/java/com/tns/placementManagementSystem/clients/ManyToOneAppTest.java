package com.tns.placementManagementSystem.clients;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.service.*;

public class ManyToOneAppTest {
	

	public static void main(String[] args) {
		
		
		// Defining factory manager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		
		em.getTransaction().begin();

//      Defining student class object 
		Student student = new Student();
//		Student student2 = new Student();
//		Certificate cret = new Certificate();
//		Certificate cret2 = new Certificate();
//		College col = new College();
		StudentServiceImp obj = new StudentServiceImp();
//		
//
//		student.setId(5);
//		student.setName("Suraj");
//		student.setCollegeName("Pillai");
//		student.setCourse("EXTC");
//		student.setHallTicketNo(46455);
//		student.setQualification("B.E");
//		student.setRoll(3);
//		
//		cret.setC_id(5);
//		cret.setCollegeName(student.getCollegeName());
//		cret.setYear(2021L);
//		student.setCertificate(cret);
//		
//		student2.setId(6);
//		student2.setName("Aditya");
//		student2.setCollegeName("Pillai");
//		student2.setCourse("EXTC");
//		student2.setHallTicketNo(66455);
//		student2.setQualification("B.E");
//		student2.setRoll(4);
//		
//		cret2.setC_id(6);
//		cret.setCollegeName(student.getCollegeName());
//		cret.setYear(2021L);
//		student2.setCertificate(cret2);
//		
//		col.setC_id(5);
//		col.setCollegeAdmin("XYZ");
//		col.setCollegeName("Pillai");
//		col.setLocation("Mumbai");
//		
//		student.setCollege_id(col);
//		student2.setCollege_id(col);
//		
//		List<Student> obj2 = List.of(student, student2);
//		
//		col.setStudent(obj2);
		
//		
//		em.persist(student);
//		em.persist(student2);
		

		
		em.getTransaction().commit();		
		System.out.println("student data added to database.");
		em.close();
		factory.close();
//		
	}

}

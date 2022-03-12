package com.tns.placementManagementSystem.clients;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Student;


public class StudentTest {
	

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		Certificate cret = new Certificate();
		College col = new College();
		
		student.setId(2);
		student.setName("Siddhant");
		student.setCollegeName("Pillai");
		student.setCourse("EXTC");
		student.setHallTicketNo(41455);
		student.setQualification("B.E");
		student.setRoll(2);
		
		cret.setC_id(2);
		cret.setCollegeName("Pillai");
		cret.setYear(2021);
		student.setCertificate(cret);
		
		col.setC_id(2);
		col.setCollegeAdmin("XYZ");
		col.setCollegeName("Pillai");
		col.setLocation("Mumbai");
		col.setU_id(2);
		
		student.setCollege_id(col);
		
		
		
		
		
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
		
	}

}

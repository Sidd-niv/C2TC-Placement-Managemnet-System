package com.tns.placementManagementSystem.clients;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.placementManagementSystem.entities.*;

public class StudentTest {

	public static void main(String[] args) {



		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		Certificate cert = new Certificate();

		student.setS_id(1);
		student.setCollegeName("Pillai");
		student.setCourse("Extc");
		student.setHallTicket(54824);
		student.setRollNo(1);
		student.setQualification("B.E");
		student.setsName("Siddhant");
		
		cert.setCert_id(1);
		cert.setCollegeName(student);
		cert.setYear(2021);
//		student.setCert_id(cert);
		
		
		
		
		

		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();

	}

}

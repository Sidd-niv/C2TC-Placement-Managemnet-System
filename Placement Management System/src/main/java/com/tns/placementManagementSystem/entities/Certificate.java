package com.tns.placementManagementSystem.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
//Above annotation states that, the below class is a table in DB
@Table(name="Certificate")
public class Certificate implements Serializable{

	// Defining serializale_id 
	private static final long serialVersionUID = 1L;
	

	// Declaring the private class variable
	// And defining the table columns with @columns
	
	//Defining the primary key with @Id
	
	@Id
	@Column(name="cert_id")
	private int cert_id;
	
	@Column(name="college_id")
	private Integer college_id;
	
	@Column(name="Year")
	private Integer year;
	
	@Column(name="collegeName")
	private Student collegeName;
	
	//to create bi-directional relationship, use one to one with mappedBy 
	//mappedBy attribute indicates property name of owner i.e. Student class
	@OneToOne(mappedBy="cert_id")
	private Student student;
	
	public int getCert_id() {
		return cert_id;
	}

	public void setCert_id(int i) {
		this.cert_id = i;
	}

	public Integer getCollege_id() {
		return college_id;
	}

	public void setCollege_id(Integer college_id) {
		this.college_id = college_id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Student getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(Student student) {
		this.collegeName = student;
	}

	
	
	
	


	

}

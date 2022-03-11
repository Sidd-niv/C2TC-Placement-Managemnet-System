package com.tns.placementManagementSystem.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


// Defining entity class student 

// Defining the POJO class with @Entity
@Entity 
@Table(name="student")
public class Student implements Serializable {
	
	// Defining serial id
	private static final long serialVersionUID = 1L;
	
	// Declaring the private class variable
	// And defining the table columns with @columns
	
	//Defining the primary key with @Id
	@Id
	@Column(name="S_id")
	private Integer s_id;
	
	
	@Column(name="sName")
	private String sName;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@Column(name="rollNo")
	private Integer rollNo;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="course")
	private String course;
	
	@Column(name="hallTicket")
	private Integer hallTicket;
	
//	@OneToOne(mappedBy="cert_id")
//	private Student student;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cert_id")
	private Certificate cert_id;
	
	@OneToOne(cascade=CascadeType.ALL,  fetch=FetchType.EAGER)
	@JoinColumn(name="cert_id")
	private College college_id;

	
	// Defining the getter and setter methods to read and write private methods 

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getHallTicket() {
		return hallTicket;
	}

	public void setHallTicket(Integer hallTicket) {
		this.hallTicket = hallTicket;
	}

	public Certificate getCert_id() {
		return cert_id;
	}

	public void setCert_id( Certificate i) {
		this.cert_id = i;
	}

	public College getCollege_id() {
		return college_id;
	}

	public void setCollege_id(College college_id) {
		this.college_id = college_id;
	}
	
	
	
}

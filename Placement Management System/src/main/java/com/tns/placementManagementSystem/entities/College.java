package com.tns.placementManagementSystem.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name="college")
public class College implements Serializable{
	
	
	// Defining serializale_id 
	private static final long serialVersionUID = 1L;
		

	// Declaring the private class variable
	// And defining the table columns with @columns
		
	//Defining the primary key with @Id
	@Id
	@Column(name="college_id")
	private String college_id;
	
	@Column(name="collegeAdmin")
	private String collegeAdmin;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="p_id")
	private Integer p_id;
	
	@Column(name="u_id")
	private Integer u_id;

	public String getCollege_id() {
		return college_id;
	}

	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}

	public String getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	
	


}

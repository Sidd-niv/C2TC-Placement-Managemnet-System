package com.tns.placementManagementSystem.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="")
public class College implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="college_id")
	private long c_id;
	
	
	@Column(name="collegeAdmin")
	private String collegeAdmin;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@Column(name="location")
	private String location;
	
	
	@Column(name="u_id")
	private Integer u_id;

	@OneToOne(mappedBy="college_id")
	private Student student;

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
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

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}

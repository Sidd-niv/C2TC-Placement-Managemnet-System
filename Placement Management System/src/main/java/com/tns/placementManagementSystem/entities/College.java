package com.tns.placementManagementSystem.entities;

import java.io.Serializable;
import java.util.List;

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
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="u_id")
	private User u_id;
	
	@OneToMany(mappedBy="college_id")
	private List<Student> student;
	
	@OneToMany(mappedBy="college_id")
	private List<Placement> placement;

	
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


	public User getU_id() {
		return u_id;
	}


	public void setU_id(User u_id) {
		this.u_id = u_id;
	}


	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}


	public List<Placement> getPlacement() {
		return placement;
	}


	public void setPlacement(List<Placement> placement) {
		this.placement = placement;
	}


	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName
				+ ", location=" + location + ", u_id=" + u_id + ", student=" + student + "]";
	}
	
	
	
}

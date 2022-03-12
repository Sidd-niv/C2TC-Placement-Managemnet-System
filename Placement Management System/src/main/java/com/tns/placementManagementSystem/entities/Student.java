package com.tns.placementManagementSystem.entities;


import java.io.Serializable;
import javax.persistence.*;


//Below annotation states that, the below class is a table in DB.
@Entity
@Table(name="Student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="S_id")
	private long id;
	
	@Column(name="sName")
	private String name;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@Column(name="rollNo")
	private long roll;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="course")
	private String course;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="cert_id")
	private Certificate certificate;
	
	@Column(name="hallTicket")
	private long hallTicketNo;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="college_id")
	private College college_id;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
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

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public College getCollege_id() {
		return college_id;
	}

	public void setCollege_id(College college_id) {
		this.college_id = college_id;
	}

	
	
	

}

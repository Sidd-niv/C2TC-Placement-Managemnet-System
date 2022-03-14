package com.tns.placementManagementSystem.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//Below annotation states that, the below class is a table in DB.
@Entity
@Table(name="Placement")
public class Placement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	// Primary key
	@Column(name="p_id")
	private Long p_id;
	
	@Column(name="pName")
	private String pName;
	
	@Column(name="pDate")
	private String pDate;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="Year")
	private Long year;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="college_id")
	private College college_id;

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public College getCollege_id() {
		return college_id;
	}

	public void setCollege_id(College college_id) {
		this.college_id = college_id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	

}

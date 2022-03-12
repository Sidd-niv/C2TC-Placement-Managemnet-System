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



@Entity
@Table(name="Student")
public class Placement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	// Primary key
	@Column(name="p_id")
	private int p_id;
	
	@Column(name="pName")
	private String pName;
	
	@Column(name="pData")
	private String pDate;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="Year")
	private int year;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="college_id")
	private College college_id;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public College getCollege_id() {
		return college_id;
	}

	public void setCollege_id(College college_id) {
		this.college_id = college_id;
	}
	
	
	
	

}

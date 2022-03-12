package com.tns.placementManagementSystem.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="certificate")
public class Certificate implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cert_id")
    private long c_id;
	
	@Column(name="Year")
    private int year;
	
	
	@Column(name="collegeName")
	private String collegeName;
	
	@OneToOne(mappedBy="certificate")
	private Student student;

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	

}

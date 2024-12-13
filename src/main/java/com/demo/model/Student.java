package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student ")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
	
	public Student() {

	}

	public Student(int sid, String sname, String scity, double spercentage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.spercentage = spercentage;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public double getSpercentage() {
		return spercentage;
	}

	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
	}
	

	
}

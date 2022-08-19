package com.neel.employeeservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	private String address;
	
	public Emp() {
		super();
	}
	public Emp(int eid, String ename, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}

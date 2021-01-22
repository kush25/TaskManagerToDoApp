package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Builder
@Entity
@Table(name="rgsdetails")
public class Useradd {
	
	@Id
	@Column(name="username")
	public String uname;
	@Column(name="pasword")
	public String upass;
	@Column(name="emails")
	public String uemail;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	@Override
	public String toString() {
		return "Useradd [uname=" + uname + ", upass=" + upass + ", uemail=" + uemail + "]";
	}
	public Useradd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Useradd(String uname, String upass, String uemail) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.uemail = uemail;
	}


	
	
	
	
	
	

}

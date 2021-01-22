package com.hcl.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="tsks")
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String tskname;
	public String descrip;
	public String email;
	public String sever;
	@Temporal(TemporalType.DATE)
	public Date startdate;
	@Temporal(TemporalType.DATE)
	public Date enddate;
	
	
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tasks(String tskname, String descrip, String email, String sever, Date startdate, Date enddate) {
		super();
		this.tskname = tskname;
		this.descrip = descrip;
		this.email = email;
		this.sever = sever;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTskname() {
		return tskname;
	}


	public void setTskname(String tskname) {
		this.tskname = tskname;
	}


	public String getDescrip() {
		return descrip;
	}


	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSever() {
		return sever;
	}


	public void setSever(String sever) {
		this.sever = sever;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	@Override
	public String toString() {
		return "Tasks [tskname=" + tskname + ", descrip=" + descrip + ", email=" + email + ", sever=" + sever
				+ ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}



	
	
}

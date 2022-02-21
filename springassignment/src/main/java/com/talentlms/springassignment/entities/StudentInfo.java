package com.talentlms.springassignment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentInfo {

	@Id
	private int sid;
	private String sname;
	private String semail;
	private String sphone;
	private String saddress;
	
	public StudentInfo(int sid, String sname, String semail, String sphone, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sphone = sphone;
		this.saddress = saddress;
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

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "StudentInfo [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sphone=" + sphone
				+ ", saddress=" + saddress + "]";
	}

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

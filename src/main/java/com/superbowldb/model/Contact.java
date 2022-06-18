package com.superbowldb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String femail;
	private String fmessage;
	
	public Contact() {}
	
	public Contact(String femail, String fmessage) {
		super();
		this.femail = femail;
		this.fmessage = fmessage;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getFmessage() {
		return fmessage;
	}
	public void setFmessage(String fmessage) {
		this.fmessage = fmessage;
	}
}

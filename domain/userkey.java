package com.citi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userkey {

	@Id
	private String Id;
	private String Password;
	
	public userkey() {
		
	}
	public userkey(String id, String password) {
		super();
		Id = id;
		Password = password;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Password=" + Password + "]";
	}
	
	
}

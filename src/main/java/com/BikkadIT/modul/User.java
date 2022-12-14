package com.BikkadIT.modul;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  uid;
	
	private String name;
	
	private String uname;
	
	private String password;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		System.out.println("User Setter Uid Called :");
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Use setter name called :");
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		System.out.println("User setter Uname called :");
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("user setter password called :");
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", uname=" + uname + ", password=" + password + "]";
	}
	
	
}


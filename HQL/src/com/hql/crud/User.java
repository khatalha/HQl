package com.hql.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="users")
@Table(name="users")
public class User {
	
	@Id
	@Column(name="uid")
	int uid;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="firstname")
	String firstname;
	
	@Column(name="lastname")
	String lastname;
	
	@Column(name="country")
	String country;

	public int getUid() {
		return uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	public User() {
		super();
	}

	public User(String username, String password, String firstname, String lastname, String country) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", country=" + country + "]";
	}
	
	
	

}

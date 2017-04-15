/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * This is and entity for user registration
 * @author swamymg
 *
 */

@Entity(name="reg_user")
@NamedQueries(value = { @NamedQuery(name = "xyz0", query = "select user.user_name from User user where email : = emailId") })
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5129692249015540573L;
	
	@Id
	@Column(name="user_name",nullable=false,length=25,unique=true)
	private String user_name;
	
	
	@Column(name="first_name",nullable=false)
	private String first_name;
	
	@Column(name="last_name",nullable=true)
	private String last_name;
	
	@Column(name="sur_name",nullable=false)
	private String sur_name;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="mobile_number",nullable=false)
	private String mobile_number;

	@Column(name="password",nullable=false)
	private String password;

	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSur_name() {
		return sur_name;
	}

	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
}

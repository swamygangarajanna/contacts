/**
 * @Copyright 2016 Kuvira Technologies
 */

package com.kuvira.contacts.app.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

/**
 * Entity for Conatct
 * @author swamymg
 *
 */
@Entity
@Table(name="contact")
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="contact")
public class Contact implements Serializable{

	


	/**
	 * 
	 */
	private static final long serialVersionUID = -800765919116120820L;


	@Id
	@Column(name="contact_name",nullable=false,length=25,unique=true)
	private String contact_name;
	
	
	@Column(name="first_name",nullable=false)
	private String first_name;
	
	@Column(name="last_name",nullable=true)
	private String last_name;
	
	@Column(name="sur_name",nullable=false)
	private String sur_name;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
	private Address address;
	
	@Column(name="mobile_number",nullable=false)
	private String mobile_number;
	
	@Column(name="contact_num",nullable=false)
	private String contact_num;

	@Column(name="email",nullable=false)
	private String email;


	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_num() {
		return contact_num;
	}

	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}



}

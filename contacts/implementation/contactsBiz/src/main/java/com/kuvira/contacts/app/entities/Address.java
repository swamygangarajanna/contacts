/**
 * @Copyright 2016 Kuvira Technologies
 */
package com.kuvira.contacts.app.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * Entity for address mapping 
 * @author swamymg
 *
 */
@Entity
@Table(name="address")
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="address")
public class Address implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4505245738955522681L;
	
	 @Id
	 @Column(name="address_id",nullable=false)
	 @GeneratedValue(strategy = GenerationType.TABLE, generator ="autogen")
	 @TableGenerator(name ="autogen",table="sequence",pkColumnName = "SEQUENCE_NAME", valueColumnName = "SEQUENCE_NEXT_VALUE",pkColumnValue="address_id", initialValue = 1, allocationSize = 1)
	 private long address_id;	 
	 @Column(name="unit",nullable=false)
	 private String unit;
	 @Column(name="street",nullable=false)
	 private String street;
	 @Column(name="area",nullable=false)
	 private String area;
	 @Column(name="state",nullable=false)
	 private String state;
	 @Column(name="country",nullable=false)
	 private String country;
	 
	 @Column(name="pincode",nullable=false)
	 private int pinCode;
	
	public long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	 
	 
}

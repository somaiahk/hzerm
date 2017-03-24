package com.mckesson.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
@Entity
@Table(name="PERSON")
public class Person extends SOXEntity {
	
	private static final long serialVersionUID = 1L;

	public Person(String id) {
		this.id = id;
	}
	
	public Person() {}
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="DATE_OF_BIRTH")
	private Timestamp dob;
	
	@Column(name="PHONE_NUMBER")
	private Integer phoneNumber;
	
	@OneToOne (fetch=FetchType.LAZY , optional=false)
    @PrimaryKeyJoinColumn(name="EDUCATION_INFO_ID", referencedColumnName = "ID")
	private EducationInfo educationInfo;
	
	@OneToOne (fetch=FetchType.LAZY , optional=false)
    @PrimaryKeyJoinColumn(name="ADDRESS_INFO_ID", referencedColumnName = "ID")
	private AddressInfo addressInfo;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Timestamp getDob() {
		return dob;
	}
	public void setDob(Timestamp dob) {
		this.dob = dob;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EducationInfo getEducationInfo() {
		return educationInfo;
	}

	public void setEducationInfo(EducationInfo educationInfo) {
		this.educationInfo = educationInfo;
	}

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}
	
	
}

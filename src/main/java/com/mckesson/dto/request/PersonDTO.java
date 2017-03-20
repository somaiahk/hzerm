package com.mckesson.dto.request;

import com.mckesson.bean.Person;

public class PersonDTO {

	private Integer id;
	private String firstName;
	private String lastName;
	private java.sql.Timestamp dob;
	private Integer phoneNumber;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	
	public java.sql.Timestamp getDob() {
		return dob;
	}
	public void setDob(java.sql.Timestamp timestamp) {
		this.dob = timestamp;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static PersonDTO mapToDto(Person person) {
		PersonDTO dto = new PersonDTO();
		dto.setId(person.getId());
		dto.setFirstName(person.getFirstName());
		dto.setLastName(person.getLastName());
		dto.setDob(person.getDob());
		dto.setPhoneNumber(person.getPhoneNumber());
		return dto;
	}
}

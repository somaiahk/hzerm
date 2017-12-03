package com.mckesson.dto.request;

import java.sql.Timestamp;
import java.util.Date;

import com.mckesson.bean.Person;

public class PersonDTO {

	private Integer id;
	private String firstName;
	private String lastName;
	private Date dob;
	private Integer phoneNumber;
	private Integer pancard;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public static Person mapToEntity(PersonDTO personDTO) {
		Person person = new Person();
		person.setId(personDTO.getId());
		person.setFirstName(personDTO.getFirstName());
		person.setLastName(personDTO.getLastName());
		person.setDob((Timestamp) personDTO.getDob());
		person.setPhoneNumber(personDTO.getPhoneNumber());
		
		return person;
	}
}

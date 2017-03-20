package com.mckesson.service;

import com.mckesson.bean.Person;
import com.mckesson.dto.request.PersonDTO;

public interface PersonService {

	void createPerson(PersonDTO personDTO);
	PersonDTO getPerson(Integer id);
	void update(Person person);
	void delete(Integer personId);
}

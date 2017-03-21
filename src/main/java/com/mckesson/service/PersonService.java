package com.mckesson.service;

import com.mckesson.dto.request.PersonDTO;

public interface PersonService {

	void createPerson(PersonDTO personDTO);
	PersonDTO getPerson(Integer id);
}

package com.mckesson.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mckesson.dao.PersonDao;
import com.mckesson.dto.request.PersonDTO;
import com.mckesson.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	public void createPerson(PersonDTO personDTO) {
		// TODO Auto-generated method stub

	}

	public PersonDTO getPerson(Integer id) {
		return PersonDTO.mapToDto(personDao.getPerson(id));
	}

}

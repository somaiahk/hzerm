package com.mckesson.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mckesson.bean.Person;
import com.mckesson.dao.PersonDao;
import com.mckesson.dto.request.PersonDTO;
import com.mckesson.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	public void createPerson(PersonDTO personDTO) {
		Person  person = new Person();
		person.setFirstName(personDTO.getFirstName());
		person.setLastName(personDTO.getLastName());
		person.setDob(personDTO.getDob());
		person.setPhoneNumber(person.getPhoneNumber());
		personDao.createPerson(person);

	}

	public PersonDTO getPerson(Integer id) {
		return PersonDTO.mapToDto(personDao.getPerson(id));
	}

	public void update(Person person) {
		personDao.update(person);
	}

	public void delete(Integer personId) {
		personDao.getPerson(personId);
	}

}

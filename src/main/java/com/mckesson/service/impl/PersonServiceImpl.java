package com.mckesson.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mckesson.bean.Person;
import com.mckesson.dao.PersonDao;
import com.mckesson.dto.request.PersonDTO;
import com.mckesson.exception.HzermException;
import com.mckesson.service.PersonService;
import com.mckesson.util.RestUtil;

/**
 * 
 * @author somaiah
 *
 */
@Service
public class PersonServiceImpl implements PersonService {
	
	private Logger LOGG = Logger.getLogger(PersonServiceImpl.class);
	
	@Autowired
	private PersonDao personDao;
	
	/**
	 * create person info into database
	 */
	
	public String createPerson(PersonDTO personDTO) {
		
		try{
			personDao.save(PersonDTO.mapToEntity(personDTO));
			
			LOGG.debug(personDTO.getId()+ ": created Succesfully");
			
		} catch(HzermException e){
			LOGG.error(e);
			throw new HzermException(e.getMessage(), "failure",500);
		}
		
		LOGG.debug("Exit form createPerson() method");
		return RestUtil.getSucessMsg();
	}
	
	/**
	 * get person Details from database 
	 */
	
	
	public PersonDTO getPerson(Integer id) {
		LOGG.debug("data is fetched..");
		return PersonDTO.mapToDto(personDao.get(id));
		
	}
	
	/**
	 * Update person info into database
	 */
	public void update(Person person) {
		personDao.save(person);
		LOGG.debug("person details updated....");
	}
	
	/**
	 * delete person from database
	 */
	public void delete(Integer personId) {
		personDao.delete(personId);
		LOGG.debug("deleted succefully");
	}
}

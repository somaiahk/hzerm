package com.mckesson.dao;

import com.mckesson.bean.Person;

public interface PersonDao {

	void createPerson(Person person);	
	Person getPerson(Integer personId);
	void update(Person person);
	void delete(Integer personId);
}

package com.mckesson.dao;

import com.mckesson.bean.Person;

public interface PersonDao {
	void createPerson(Person person);

	void updatePerson(Person person);
}

package com.mckesson.dao.impl;

import org.springframework.stereotype.Repository;

import com.mckesson.bean.Person;
import com.mckesson.dao.GenericDao;
import com.mckesson.dao.PersonDao;

@Repository
public class PersonDaoImpl extends GenericDao<Integer, Person> implements PersonDao {

	public PersonDaoImpl() {
		super(Person.class);
	}

}

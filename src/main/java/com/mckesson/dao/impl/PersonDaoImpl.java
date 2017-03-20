package com.mckesson.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mckesson.bean.Person;
import com.mckesson.dao.PersonDao;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createPerson(Person person) {
		// TODO Auto-generated method stub

	}

	public Person getPerson(Integer personId) {
		Person person = (Person) sessionFactory.openSession().get(Person.class, new Integer(personId));
		return person;
	}

}

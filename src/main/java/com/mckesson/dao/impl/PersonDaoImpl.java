package com.mckesson.dao.impl;

import org.hibernate.Session;
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
		
		 Session session = sessionFactory.openSession();
	        session.persist(person);
		
	}

	public Person getPerson(Integer personId) {
		Person person = (Person) sessionFactory.openSession().get(Person.class, new Integer(personId));
		return person;
	}

	public void update(Person person) {
		Session session = this.sessionFactory.openSession();
		session.update(person);
	}

	public void delete(Integer personId) {
		Session session = this.sessionFactory.openSession();
		Person p = (Person) session.load(Person.class, new Integer(personId));
		if(null != p){
			session.delete(p);
		}
	}

}

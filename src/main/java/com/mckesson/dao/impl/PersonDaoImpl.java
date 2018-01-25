package com.mckesson.dao.impl;

import javax.transaction.Transaction;

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

	// to creare Person Information
	public void createPerson(Person person) {
		Session ses = sessionFactory.openSession();
		org.hibernate.Transaction tx = ses.beginTransaction();
		ses.save(person);
		tx.commit();
	}

	@Override
	public void updatePerson(Person person) {
		Session ses = sessionFactory.openSession();
		ses.update(person);

	}

}

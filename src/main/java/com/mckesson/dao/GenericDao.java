package com.mckesson.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDao<PK, T> implements BaseDao<PK, T> {
	
	private Class<T> entityClass;
	
	protected GenericDao() {

	}

	protected GenericDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Autowired
	private SessionFactory sessionFactory;	
	private Session session;	
	
	public Session getCurrentSession() {
		if (this.session != null && this.session.isOpen()) {
			return this.session;
		}
		this.session = sessionFactory.openSession();
		return this.session;
	}
	
	public void closeSession() {
		if (this.session != null) {
			if (this.session.isOpen()) {
				this.session.close();
			}
			this.session = null;
		}
	}

	public void save(T entity) {
		getCurrentSession().save(entity);		
	}

	public T saveAndFlush(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveAll(T[] objects) {
		// TODO Auto-generated method stub
		
	}

	public void saveAll(List<?> objects) {
		// TODO Auto-generated method stub
		
	}

	public List<T> saveAndFlushAll(List<T> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(T entity) {
		// TODO Auto-generated method stub
		
	}

	public boolean delete(PK key) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteAll(T[] objects) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public T get(PK key) {
		return (T) getCurrentSession().get(this.entityClass, (Serializable) key);
	}

}

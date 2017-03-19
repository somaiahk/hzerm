package com.mckesson.dao;

import java.util.List;

public interface BaseDao<PK, T> {
	
	/**
	 * Saves and entity in the database. The save operation is both insert or
	 * update statement depending if the entity is a new instance or a loaded
	 * one.
	 * 
	 * @param entity
	 *            the entity to be saved.
	 */
	public void save(T entity);
	
	/**
	 * Saves entity in the database. The save operation is both insert or
	 * update statement depending if the entity is a new instance or a loaded
	 * one, and also generate if any auto generated id available in entity.
	 * 
	 * @param entity
	 *            the entity to be saved.
	 */
	public T saveAndFlush(T entity);

	/**
	 * 
	 * @param objects
	 */
	public void saveAll(T[] objects);

	public void saveAll(List<?> objects);
	
	public List<T> saveAndFlushAll(List<T> objects);

	public void persist(T entity);

	boolean delete(PK key);

	void deleteAll(T[] objects);

	public T get(PK key);


}


package com.mckesson.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Babu Vayila
 * Dated : 25-Mar-2017
 * 
 * <p>
 * UUID entity contains the field UUID that is common for all entities that 
 * need to generate automatically.
 * </p>
 */
@MappedSuperclass
public class UUID {
	
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

}

package com.mckesson.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
@Entity
@Table(name="CODES")
public class Codes extends SOXEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(name="CODE")
	protected String code;
	
	@Column(name="NAME")
	protected String name;
	
	@Column(name="TYPE")
	protected String type;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}

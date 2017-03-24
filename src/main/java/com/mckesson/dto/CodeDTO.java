package com.mckesson.dto;

import com.mckesson.bean.Codes;


/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
public class CodeDTO {
	
	private String id;
	private String code;	
	private String name;	
	private String type;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
	public Codes mapToEntity() {
		Codes code = new Codes();
		code.setId(this.getId());
		code.setCode(this.getCode());
		code.setName(this.getName());
		code.setType(this.getType());
		return code;
	}
	
	public static CodeDTO mapToDTO(Codes code) {
		if (null == code) {
			return null;
		}
		
		CodeDTO dto = new CodeDTO();
		dto.setId(code.getId());
		dto.setCode(code.getCode());
		dto.setName(code.getName());
		dto.setType(code.getType());
		return dto;
	}

}

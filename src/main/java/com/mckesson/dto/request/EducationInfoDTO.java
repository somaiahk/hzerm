package com.mckesson.dto.request;

import java.util.Date;

import com.mckesson.bean.EducationInfo;
import com.mckesson.dto.CodeDTO;
import com.mckesson.util.DateUtil;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
public class EducationInfoDTO {
	
	private CodeDTO cource;	
	private CodeDTO college;	
	private Date passedYear;	
	private String place;
	
	public CodeDTO getCource() {
		return cource;
	}
	public void setCource(CodeDTO cource) {
		this.cource = cource;
	}
	public CodeDTO getCollege() {
		return college;
	}
	public void setCollege(CodeDTO college) {
		this.college = college;
	}
	public Date getPassedYear() {
		return passedYear;
	}
	public void setPassedYear(Date passedYear) {
		this.passedYear = passedYear;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public EducationInfo mapToEntity() {
		EducationInfo entity = new EducationInfo();
		entity.setCollege(this.getCollege() == null ? null : this.getCollege().mapToEntity());
		entity.setCource(this.getCource() == null ? null : this.getCource().mapToEntity());
		entity.setPassedYear(DateUtil.getTimestampFromDate(this.getPassedYear()));
		entity.setPlace(this.getPlace());
		return entity;
	}
	
	public static EducationInfoDTO mapToDTO(EducationInfo entity) {
		if (null == entity) {
			return null;
		}
		
		EducationInfoDTO dto = new EducationInfoDTO();
		dto.setCollege(CodeDTO.mapToDTO(entity.getCollege()));
		dto.setCource(CodeDTO.mapToDTO(entity.getCource()));
		dto.setPassedYear(entity.getPassedYear());
		dto.setPlace(entity.getPlace());
		return dto;		
	}

}

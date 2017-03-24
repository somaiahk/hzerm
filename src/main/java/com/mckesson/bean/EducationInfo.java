package com.mckesson.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
public class EducationInfo extends SOXEntity {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
    @PrimaryKeyJoinColumn(name="COURSE_ID", referencedColumnName = "ID")
	protected Codes cource;
	
	@ManyToOne
    @PrimaryKeyJoinColumn(name="COLLEGE_ID", referencedColumnName = "ID")
	protected Codes college;
	
	@Column(name="PASSED_YEAR")
	protected Timestamp passedYear;
	
	@Column(name="PLACE")
	protected String place;

	public Codes getCource() {
		return cource;
	}

	public void setCource(Codes cource) {
		this.cource = cource;
	}

	public Codes getCollege() {
		return college;
	}

	public void setCollege(Codes college) {
		this.college = college;
	}

	public Timestamp getPassedYear() {
		return passedYear;
	}

	public void setPassedYear(Timestamp passedYear) {
		this.passedYear = passedYear;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	

}

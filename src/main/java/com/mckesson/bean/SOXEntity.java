package com.mckesson.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Babu Vayila
 * Dated : 25-Mar-2017
 * 
 * <p>
 * SOX entity contains the fields that are common for all entities that 
 * need to record their last modification and creation information according
 * to SOX standards.
 * </p>
 */
@MappedSuperclass
public class SOXEntity extends UUID implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="CREATED_ON")
	protected Timestamp createdTime;
	
	@Column(name="CREATED_BY")
	protected String createdBy;
	
	@Column(name="MODIFIED_ON")
	protected Timestamp modifiedTime;
	
	@Column(name="MODIFIED_BY")
	protected String modifiedBy;
	
	@Column(name="ROW_STATUS")
	protected int rowStatus;

	/**
	 * @return the createdTime
	 */
	public Timestamp getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedTime
	 */
	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	/**
	 * @param modifiedTime the modifiedTime to set
	 */
	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	/**
	 * @return the rowStatus
	 */
	public int isRowStatus() {
		return rowStatus;
	}

	/**
	 * @param rowStatus the rowStatus to set
	 */
	public void setRowStatus(int rowStatus) {
		this.rowStatus = rowStatus;
	}

}


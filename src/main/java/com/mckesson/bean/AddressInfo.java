package com.mckesson.bean;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
public class AddressInfo extends SOXEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(name="STREET_ADDRESS_1")
	protected String streetAddress_1;
	
	@Column(name="STREET_ADDRESS_2")
	protected String streetAddress_2;
	
	@ManyToOne
    @PrimaryKeyJoinColumn(name="STATE_ID", referencedColumnName = "ID")
	protected Codes state;
	
	@Column(name="PIN_CODE")
	protected Integer pincode;

	public String getStreetAddress_1() {
		return streetAddress_1;
	}

	public void setStreetAddress_1(String streetAddress_1) {
		this.streetAddress_1 = streetAddress_1;
	}

	public String getStreetAddress_2() {
		return streetAddress_2;
	}

	public void setStreetAddress_2(String streetAddress_2) {
		this.streetAddress_2 = streetAddress_2;
	}

	public Codes getState() {
		return state;
	}

	public void setState(Codes state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	

}

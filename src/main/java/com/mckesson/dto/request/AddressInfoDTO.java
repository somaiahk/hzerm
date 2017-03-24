package com.mckesson.dto.request;

import com.mckesson.bean.AddressInfo;
import com.mckesson.dto.CodeDTO;

/**
 * @author Babu Vayila
 * Dated : 15-Mar-2017
 */
public class AddressInfoDTO {
	
	private String streetAddress_1;	
	private String streetAddress_2;	
	private CodeDTO state;	
	private Integer pincode;
	
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
	public CodeDTO getState() {
		return state;
	}
	public void setState(CodeDTO state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	public AddressInfo mapToEntity() {
		AddressInfo address = new AddressInfo();
		address.setStreetAddress_1(this.getStreetAddress_1());
		address.setStreetAddress_2(this.getStreetAddress_2());
		address.setState(this.getState() == null ? null : this.getState().mapToEntity());
		address.setPincode(this.getPincode());
		return address;
	}
	
	public static AddressInfoDTO mapToDTO(AddressInfo address) {
		if (null == address) {
			return null;
		}
		
		AddressInfoDTO dto = new AddressInfoDTO();
		dto.setStreetAddress_1(address.getStreetAddress_1());
		dto.setStreetAddress_2(address.getStreetAddress_2());
		dto.setState(CodeDTO.mapToDTO(address.getState()));
		dto.setPincode(address.getPincode());
		return dto;
	}

}

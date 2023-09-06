package com.cg.response;

import com.cg.entity.Address;

public class AddressResponse {
	
	private long addressId;
	
	private String street;
	
	private String city;
	//to return response 
	public AddressResponse(Address address) {
		this.addressId= address.getId();
		this.street=address.getCity();
		this.city= address.getCity();
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
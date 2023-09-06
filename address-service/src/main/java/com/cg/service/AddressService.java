package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Address;
import com.cg.repository.AddressRepository;
import com.cg.request.CreateAddressRequest;
import com.cg.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	//to create an address
	public AddressResponse createAddress(CreateAddressRequest createAddressRequest) {
		
		Address address= new Address();
		
		address.setStreet(createAddressRequest.getStreet());
		address.setCity(createAddressRequest.getCity());
		
		addressRepository.save(address);
		
		return new AddressResponse(address);
	}

	//To fetch address by using Id
	public AddressResponse getById(long id) {
		
		Address address = addressRepository.findById(id).get();
		
		return new AddressResponse(address);
	}

}

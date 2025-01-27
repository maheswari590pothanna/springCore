package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	private Address address;
	
//	@Autowired
//	Student(Address address)
//	{
//		this.address=address;
//	}

	public Address getAddress() {
		return address;
	}
//
//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	

}

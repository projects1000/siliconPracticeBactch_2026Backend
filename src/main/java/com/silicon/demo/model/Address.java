package com.silicon.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Address Details")
public class Address {

    @Schema(description = "Name of the person", example = "Priyabrata Pattanaik")
	private String name ;
	
    public Address(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}


	@Schema(description = "Residential address", example = "Bhubaneswar, Odisha")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	Address()
	{
		System.out.println("Constructor executed");
	}
	
	
	
}

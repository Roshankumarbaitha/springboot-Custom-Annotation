package com.example.Sprinboot_custom_annotation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity(name="Student data")
public class Student 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotNull
            //@Size(min=10,message="name should be 10 char")
    String name;
    @AddressValidation(message="put a valid address")
    String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
    
	

}

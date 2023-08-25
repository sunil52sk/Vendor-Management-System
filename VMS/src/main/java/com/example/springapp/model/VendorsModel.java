package com.example.springapp.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendors")
public class VendorsModel {
	@Id
//	@Generatedvalue(strategy = generationtype.AUTO)
	int vendorId;
	String name,specilization,email,address,contact,domainofwork;
	long spent;
	
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public long getSpent() {
		return spent;
	}
	public void setSpent(long spent) {
		this.spent = spent;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public String getDomainofwork() {
		return domainofwork;
	}
	public void setDomainofwork(String domainofwork) {
		this.domainofwork = domainofwork;
	}
	public VendorsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public VendorsModel(int vendorId, String name, String specilization, String email, String address,String domainofwork, String contact,
			long spent) {
		super();
		this.vendorId = vendorId;
		this.name = name;
		this.specilization = specilization;
		this.email = email;
		this.domainofwork=domainofwork;
		this.address = address;
		this.contact = contact;
		this.spent = spent;
		
	}
	@Override
	public String toString() {
		return "vendor [Id=" + vendorId  + ", name=" + name + ", specilization=" + specilization + ", phone=" + contact
				+ ", email=" + email + ", address=" + address +", Domain of work"+domainofwork+ "]";
	}
}

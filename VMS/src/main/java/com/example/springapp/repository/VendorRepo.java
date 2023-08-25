package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.VendorsModel;

public interface VendorRepo extends JpaRepository<VendorsModel, Integer>{
	
}

package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.ProjectsModel;

public interface ProjectRepo extends JpaRepository<ProjectsModel, Integer>{
	
}

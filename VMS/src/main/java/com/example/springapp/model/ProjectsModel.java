package com.example.springapp.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProjectsModel {
	@Id
	private int projectCode;
	private String title;
	private Date startDate,endDate;
	private long budget;
	public int getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public ProjectsModel(int projectCode, String title, Date startDate, Date endDate, long budget) {
		super();
		this.projectCode = projectCode;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.budget = budget;
	}
	public ProjectsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}

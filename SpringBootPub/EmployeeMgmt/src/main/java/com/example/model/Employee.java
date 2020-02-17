package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eId;
	private String eName;
	private String eDesignation;
	private double eSalary;
	
	
	public Employee() {

	}
	
	
	public Employee(Long eId, String eName, String eDesignation, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDesignation = eDesignation;
		this.eSalary = eSalary;
	}


	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDesignation=" + eDesignation + ", eSalary=" + eSalary
				+ "]";
	}
	
	
}

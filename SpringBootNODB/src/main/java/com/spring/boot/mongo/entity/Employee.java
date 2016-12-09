package com.spring.boot.mongo.entity;




public class Employee{
	private Long empId;

	private String designation;

	private String name;
	
	private Double salary;
		
	public Employee() {	
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	public Employee(Long empId, String designation, String name, Double salary) {
		super();
		this.empId = empId;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}			
		
}

package com.sgic.employee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String jobTitle;
	private String department;
	private String gender;
	private Long salary;
	private String address;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id", nullable = false, unique = true)
	private Employee employee;
	// TODO: Generate Getters and Setters...

	public EmployeeDetails() {

	}

	public EmployeeDetails(String jobTitle, String department, String gender, Long salary, String address) {
		super();
		this.jobTitle = jobTitle;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", jobTitle=" + jobTitle + ", department=" + department + ", gender="
				+ gender + ", salary=" + salary + ", address=" + address + ", employee=" + employee + "]";
	}

}

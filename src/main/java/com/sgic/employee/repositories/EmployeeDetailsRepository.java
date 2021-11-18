package com.sgic.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.employee.entities.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Long>{

}

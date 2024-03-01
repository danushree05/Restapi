package com.pmsmapping.pmsmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmsmapping.pmsmapping.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
}

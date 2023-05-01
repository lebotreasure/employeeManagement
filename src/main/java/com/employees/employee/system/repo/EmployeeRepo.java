package com.employees.employee.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.employee.system.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

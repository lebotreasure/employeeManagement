package com.employees.employee.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.employee.system.models.Employee;
import com.employees.employee.system.repo.EmployeeRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> findOne(Employee employee) {
        return employeeRepo.findById(employee.getId());
    }

    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id) {
        employeeRepo.deleteById(id);
    }
}

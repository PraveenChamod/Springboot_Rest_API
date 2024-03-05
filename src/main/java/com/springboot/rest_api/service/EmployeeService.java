package com.springboot.rest_api.service;

import com.springboot.rest_api.exception.EmployeeServiceException;
import com.springboot.rest_api.model.Employee;
import com.springboot.rest_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        try{
            return employeeRepository.findAll();
        } catch (Exception e) {
            throw new EmployeeServiceException("An error occurred while fetching employees.", e);
        }
    }
}

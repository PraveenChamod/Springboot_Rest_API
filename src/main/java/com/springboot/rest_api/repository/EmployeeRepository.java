package com.springboot.rest_api.repository;

import com.springboot.rest_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

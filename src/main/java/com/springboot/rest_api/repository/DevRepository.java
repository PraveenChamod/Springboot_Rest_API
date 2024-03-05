package com.springboot.rest_api.repository;

import com.springboot.rest_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevRepository extends JpaRepository<Employee,Long> {
}

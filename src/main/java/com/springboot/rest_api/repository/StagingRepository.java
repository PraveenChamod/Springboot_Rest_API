package com.springboot.rest_api.repository;

import com.springboot.rest_api.model.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("staging")
public interface StagingRepository extends EmployeeRepository {
}

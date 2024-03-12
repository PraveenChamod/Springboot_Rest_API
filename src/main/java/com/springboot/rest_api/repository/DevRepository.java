package com.springboot.rest_api.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public interface DevRepository extends EmployeeRepository {

}

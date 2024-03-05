package com.springboot.rest_api.service;

import com.springboot.rest_api.exception.EmployeeServiceException;
import com.springboot.rest_api.model.Employee;
import com.springboot.rest_api.repository.DevRepository;
import com.springboot.rest_api.repository.StagingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private final DevRepository devRepository;
    private final StagingRepository stagingRepository;
    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Autowired
    public EmployeeService(DevRepository devRepository, StagingRepository stagingRepository) {
        this.devRepository = devRepository;
        this.stagingRepository = stagingRepository;
    }

    public List<Employee> getEmployees() {
        try{
            if ("staging".equals(activeProfile)) {
                return stagingRepository.findAll();
            } else {
                return devRepository.findAll();
            }
        } catch (Exception e) {
            throw new EmployeeServiceException("An error occurred while fetching employees.", e);
        }
    }
}

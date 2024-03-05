package com.springboot.rest_api.config;

import com.springboot.rest_api.model.Employee;
import com.springboot.rest_api.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee james = new Employee(
                    "James White",
                    "james123@gmail.com",
                    "+78568945",
                    21
            );
            Employee pole = new Employee(
                    "pole White",
                    "pole123@gmail.com",
                    "+78568945",
                    22
            );
            repository.saveAll(
                    List.of(james, pole)
            );
        };
    }
}

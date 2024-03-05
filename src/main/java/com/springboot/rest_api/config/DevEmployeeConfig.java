package com.springboot.rest_api.config;

import com.springboot.rest_api.model.Employee;
import com.springboot.rest_api.repository.DevRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("dev")
public class DevEmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(DevRepository repository) {
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

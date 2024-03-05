package com.springboot.rest_api.config;

import com.springboot.rest_api.model.Employee;
import com.springboot.rest_api.repository.StagingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("staging")
public class StagingEmployeeConfig {
    @Bean
    CommandLineRunner stagingCommandLineRunner(StagingRepository repository) {
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
            Employee nita = new Employee(
                    "nita White",
                    "nita123@gmail.com",
                    "+89568948",
                    41
            );
            Employee dyan = new Employee(
                    "dyan White",
                    "dyan123@gmail.com",
                    "+56568945",
                    50
            );
            Employee kyle = new Employee(
                    "kyle White",
                    "kyle123@gmail.com",
                    "+45568948",
                    45
            );
            Employee mills = new Employee(
                    "mills White",
                    "mills123@gmail.com",
                    "+96568945",
                    78
            );
            repository.saveAll(
                    List.of(james, pole, nita, dyan, kyle, mills)
            );
        };
    }
}

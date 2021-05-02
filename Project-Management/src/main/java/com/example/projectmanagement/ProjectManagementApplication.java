package com.example.projectmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableEurekaClient
public class ProjectManagementApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

}

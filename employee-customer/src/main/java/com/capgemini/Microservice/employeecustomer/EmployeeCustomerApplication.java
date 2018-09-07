package com.capgemini.Microservice.employeecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCustomerApplication.class, args);
	}
}

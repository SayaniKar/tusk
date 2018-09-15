package com.capgemini.Microservice.DepartmentProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentProducerApplication.class, args);
	}
}

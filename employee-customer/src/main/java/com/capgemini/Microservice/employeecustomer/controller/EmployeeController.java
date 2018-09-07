package com.capgemini.Microservice.employeecustomer.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	@Autowired
private DiscoveryClient discoveryClient;
	
	@RequestMapping(value = "/getemployee", method = RequestMethod.GET)
	  public String getEmployee()throws RestClientException,IOException
	  {
	  List<ServiceInstance> instances= discoveryClient.getInstances("MicroService");
	  ServiceInstance serviceInstance=instances.get(0);
	  
	  
	String baseUrl="http://localhost:9005/employee";
	baseUrl=baseUrl+"/employee";
	RestTemplate restTemplate=new RestTemplate();
	ResponseEntity<String> response=null;
		try
		{
			response=restTemplate.exchange(baseUrl,HttpMethod.GET,getHeaders(),String.class);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(response.getBody());
		return response.getBody();
	}
	
	private static HttpEntity<?>getHeaders()throws IOException{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		return  new HttpEntity<>(headers);
	}

}

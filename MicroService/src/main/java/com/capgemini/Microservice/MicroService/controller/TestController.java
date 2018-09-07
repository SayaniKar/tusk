package com.capgemini.Microservice.MicroService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Microservice.MicroService.model.EmployeePojo;

@RestController
public class TestController {
	  @RequestMapping(value="/employee" ,method = RequestMethod.GET)
	public EmployeePojo firstPage()
	{
		EmployeePojo emp1=new EmployeePojo();
		emp1.setId("1");
		emp1.setName("kk");
		emp1.setDesignation("Analyst");
		emp1.setSalary(1000);
		return emp1;
		
	}

}

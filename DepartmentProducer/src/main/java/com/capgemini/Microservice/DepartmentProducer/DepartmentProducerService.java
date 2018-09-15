package com.capgemini.Microservice.DepartmentProducer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentProducerService {

	@Autowired
	private DepartmentProducerRepository departmentProducerRepository;
public  List<DepartmentPojo> getAllContent()
{

List<DepartmentPojo>department=new ArrayList<>();
departmentProducerRepository.findAll().forEach(department::add);
return department;
}
}
package com.cts.handson.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.cts.handson.entity.Employee;
import com.cts.handson.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Value("Employee_Data.json")
	private Resource resource;

	public void saveFromFile() throws IOException {
		List<Employee> list = new ArrayList<>();
		File f = resource.getFile();
		ObjectMapper objectMapper = new ObjectMapper(); 
		list =  Arrays.asList(objectMapper.readValue(f, Employee[].class));
		System.out.println("List Size: "+list.size());
		repo.saveAll(list);
	}

	public List<Employee> findAll() {
		return repo.findAll();
	}
}

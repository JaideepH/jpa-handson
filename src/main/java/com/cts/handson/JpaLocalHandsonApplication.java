package com.cts.handson;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.handson.entity.Employee;
import com.cts.handson.service.EmployeeService;
//import com.cts.handson.service.ProductService;

@SpringBootApplication
public class JpaLocalHandsonApplication {
	

	public static void main(String[] args) throws IOException {
		ApplicationContext context = SpringApplication.run(JpaLocalHandsonApplication.class, args);
//		ProductService productService = context.getBean(ProductService.class);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		//List<Product> list =  productService.findAll();
		//System.out.println(list);
		
		employeeService.saveFromFile();
		//List<Employee> list = employeeService.findAll();
		//System.out.println(list);
	}

}

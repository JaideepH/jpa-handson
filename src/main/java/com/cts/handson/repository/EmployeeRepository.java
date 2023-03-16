package com.cts.handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.handson.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

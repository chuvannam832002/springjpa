package com.example.demospringjpa.controller;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    List<Employee> findEmployeeByFirstName(String str);
    List<Employee> removeEmployeeByFirstName(String str);
}

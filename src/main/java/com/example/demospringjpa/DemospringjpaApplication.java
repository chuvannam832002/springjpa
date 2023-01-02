package com.example.demospringjpa;

import com.example.demospringjpa.controller.Employee;
import com.example.demospringjpa.controller.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemospringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringjpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(EmployeeRepository repository)
	{
		return (args -> {
//			insertJava(repository);
//			System.out.println(repository.findAll());
			System.out.println(repository.findEmployeeByFirstName("Alex"));
			System.out.println(repository.removeEmployeeByFirstName("Alex"));
			System.out.println(repository.findAll());
		});
	}
	private void insertJava(EmployeeRepository employeeRepository)
	{
		employeeRepository.save(new Employee("Chu","Nam"));
		employeeRepository.save(new Employee("Huyen","Ngan"));
		employeeRepository.save(new Employee("Alex","Jack"));
		employeeRepository.save(new Employee("Alion","Musk"));

	}
}

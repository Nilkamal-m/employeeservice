package com.neel.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.neel.employeeservice.entity.Emp;
import com.neel.employeeservice.repo.EmpRepository;

@SpringBootApplication
public class EmployeeServiceApplication {
	
	@Autowired
	private EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Emp e1 = new Emp();
				e1.setEname("Nilkamal");
				e1.setAddress("Daulatpur");
				
				Emp e2 = new Emp();
				e2.setEname("Neel");
				e2.setAddress("Daulatpur");
				
				Emp e3 = new Emp();
				e3.setEname("Hrishi");
				e3.setAddress("Kolkata");
				empRepository.save(e1);
				empRepository.save(e2);
				empRepository.save(e3);
			}
		};
		return commandLineRunner;
	}

}

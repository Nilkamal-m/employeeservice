package com.neel.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neel.employeeservice.entity.Emp;
import com.neel.employeeservice.repo.EmpRepository;

@RestController
@RequestMapping("employees")
public class EmpController {
	
	@Autowired
	private EmpRepository empRepository;
	
	@GetMapping
	public List<Emp> getEmployees(){
		return empRepository.findAll(); 
	}

}

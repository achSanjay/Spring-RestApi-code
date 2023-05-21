package com.example.restapi.controller;


import com.example.restapi.entity.Employee;
import com.example.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {


				@Autowired
				EmployeeRepository employeeRepository;

				@PostMapping("/employees")
				public Employee createEmployee(@RequestBody Employee employee) {
								return employeeRepository.save(employee);
				}

				@GetMapping("/getAllEmployees")
				public List<Employee> getAllEmployees() {
								return employeeRepository.findAll();
				}


				@GetMapping("/employees/{id}")
				public Optional<Employee> getEmployeeById(@PathVariable Long id) {
								return employeeRepository.findById(id);
				}

				@PutMapping("/employees/{id}")
				public Employee editEmployee(@PathVariable Long id, @RequestBody Employee employee) {
								employee.setEmpId(id);
								return employeeRepository.save(employee);
				}


				@DeleteMapping("/employees/{id}")
				public String deleteEmployee(@PathVariable Long id) {
								employeeRepository.deleteById(id);
								return "employee deleted successfully";
				}


}

package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;
import com.masai.Services.EmployeeService;

import jakarta.validation.Valid;

@RestController

public class MyController {
	
	
	@Autowired
	private EmployeeService empserv;
	
	@PostMapping("/Employees")
	public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee own ){
		
		Employee save= empserv.addEmployee(own);
		return new ResponseEntity<>(save, HttpStatus.CREATED);
		
		
	}
	
	
	@GetMapping("/EmployeeList")
	public ResponseEntity<List<Employee>> ListOfEmployee() throws EmployeeException{
		List<Employee> li = empserv.ListOfEmployee();
		
		return new ResponseEntity<>(li, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer id) throws EmployeeException{
		String em= empserv.DeleteEmployee(id);
		return new ResponseEntity<>(em,HttpStatus.OK);
		
		
	}

	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> EmployeeUpdation(@RequestBody @Valid  Employee empl) throws  EmployeeException{
		Employee pr=empserv.updateEmployee(empl);
		return new ResponseEntity<>(pr,HttpStatus.OK);
		
	}
	
}

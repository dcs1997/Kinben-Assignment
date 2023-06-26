package com.masai.Services;

import java.util.List;

import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;

public interface EmployeeService {
	
	public List<Employee> ListOfEmployee()throws EmployeeException;
	
	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp)throws EmployeeException;
	
	public String DeleteEmployee(Integer empid)throws EmployeeException;
	

}

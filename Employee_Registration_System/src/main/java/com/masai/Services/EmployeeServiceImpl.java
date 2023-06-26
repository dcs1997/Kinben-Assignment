package com.masai.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.masai.Entity.Employee;
import com.masai.Exception.EmployeeException;
import com.masai.Repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
     @Autowired
	private EmployeeRepo emprepo;
	
	@Override
	public List<Employee> ListOfEmployee() throws EmployeeException {
       
		List<Employee> allemployee = emprepo.findAll();
		
		return allemployee;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		
		return emprepo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
		Employee em = emprepo.findById(emp.getEmpid()).orElseThrow(() ->new EmployeeException("Employee not found") );
		
		
		em.setEmpName(emp.getEmpName());
		em.setEmail(emp.getEmail());
		em.setAddress(emp.getAddress());
		em.setEducation(emp.getEducation());
		em.setExp(emp.getExp());
		em.setPhone(emp.getPhone());
		
		
		
		return emprepo.save(em);
		
	}

	@Override
	public String DeleteEmployee(Integer empid) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee em = emprepo.findById(empid).orElseThrow(()-> new EmployeeException("Employee not found"));
		
		if(em!= null) emprepo.delete(em);
		
		return "Employee Deleted Successfully";
	}

}

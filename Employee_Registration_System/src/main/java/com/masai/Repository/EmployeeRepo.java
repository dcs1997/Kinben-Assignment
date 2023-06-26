package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.masai.Entity.Employee;
@Service
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

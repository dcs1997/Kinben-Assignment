package com.masai.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
    
    @NotNull
	@Pattern(regexp = "[A-Za-z]+", message = "Name must not contain numbers or special characters")
    private String empName; 
	
    @Size(min = 10, max = 10 , message = "Number should be minimum of 10 digits")
    private String phone;
    
    @Column(unique = true)
    private String email;
    
    private String address;
    
    @Enumerated(EnumType.STRING)
    private education education;
    
    @Min(value = 1, message="Enter the experience in months.")
    private int exp;

	public Employee() {
		super();
	}

	

	


	public Employee(int empid,
			@NotNull @Pattern(regexp = "[A-Za-z]+", message = "Name must not contain numbers or special characters") String empName,
			@Size(min = 10, max = 10, message = "Number should be minimum of 10 digits") String phone, String email,
			String address, com.masai.Entity.education education,
			@Min(value = 1, message = "Enter the experience in months.") int exp) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.education = education;
		this.exp = exp;
	}






	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public education getEducation() {
		return education;
	}

	public void setEducation(education education) {
		this.education = education;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", phone=" + phone + ", email=" + email
				+ ", address=" + address + ", education=" + education + ", exp=" + exp + "]";
	}
    
    
    
    
	
}

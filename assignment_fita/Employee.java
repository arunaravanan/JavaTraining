package com.java.training.assignment_fita;


public class Employee extends PersonalInfo{
	private String name;
	private double monthlySalary;
	private Department dept;
    
	public Employee (String name, double monthlySalary,char gender, String phone, String address,int deptCode,String deptName) 
    { 
        this.name = name; 
        this.monthlySalary = monthlySalary; 
        this.address=address;
        this.gender=gender;
        this.phone=phone;
        this.dept=new Department(deptCode,deptName);
        
    } 
	
	
	
	public String getName() {
		return name;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [id=" + id +", name=" + name + ", monthlySalary=" + monthlySalary + ", gender=" + gender + ", phone=" + phone
				+ ", address=" + address + ", Department="+dept.getDeptName()+", Department code="+dept.getDeptCode()+"]";
	}

}

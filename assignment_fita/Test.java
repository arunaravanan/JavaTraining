package com.java.training.assignment_fita;

import java.util.ArrayList;



public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee("Arun", 25000, 'M', "9944775312", "Kumbakonam",001,"IT");
		Employee e2 = new Employee("Bala", 28000, 'M', "9854675843", "Trichy",001,"IT");
		Employee e3 = new Employee("Maha", 35000, 'F', "7358163812", "Chennai",001,"IT");
		ArrayList<Employee>  d1 = new ArrayList <Employee>();
		d1.add(e1);
		d1.add(e2);
		d1.add(e3);

		for(Employee e: d1 )
		System.out.println(e);
		
		EmployeeFinancials update = new EmployeeFinancials();
		
		update.UpdateAnnualSalary(e1);
		update.UpdateAnnualSalary(e2);
		update.UpdateAnnualSalary(e3);
		
		
		
		update.Tax(e1);
		update.Tax(e2);
		update.Tax(e3);
		
		for(Employee e: d1 )
			System.out.println(e);
	
	}

}

//import java.util.List;
//Department dpt1 = new Department(1, "IT");
//List<Employee> Employees = dpt1.getTotalEmployeesInDepartment( );
//System.out.println("The Initial Employee Details");
//System.out.println(dpt1.getDeptName()+"("+dpt1.getDeptCode()+") :");
//for (Employee EmpDet : Employees)
//	System.out.println(EmpDet);

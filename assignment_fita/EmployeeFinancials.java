package com.java.training.assignment_fita;

public class EmployeeFinancials{
	
	
	public void UpdateAnnualSalary(Employee e){
		
		e.setMonthlySalary(1.05*e.getMonthlySalary());
		System.out.println("The Updated Annual salary for "+e.getName()+" is "+e.getMonthlySalary()*12);
	}
	public void Tax(Employee e ) {
		double taxIncurred;
		
		if(e.gender=='M') 
			 taxIncurred = (.1*(e.getMonthlySalary()));
		else
			taxIncurred=  (.05*(e.getMonthlySalary()));
		System.out.println("The Tax Incurred for "+e.getName()+" is "+taxIncurred);
	}

}

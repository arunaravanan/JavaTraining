package com.java.training.assignment2_fita;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Employee>{
	String s;
	
	public ComparatorClass(String s) {
		super();
		this.s = s;
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		int returnCode = 0;

	    if(s.equals("Name"))
	    	 returnCode=e1.getEmp_Name().compareTo(e2.getEmp_Name());
	    else if(s.equals("Department"))
	    	 returnCode=e1.getDept().compareTo(e2.getDept());
	    else if(s.equals("Salary"))
	    	 returnCode= e1.getSalary()-e2.getSalary();
	    else if(s.equals("Experience"))
	    	 returnCode=e1.getExp()-e2.getExp();
	    else if(s.equals("Id"))
	    	 returnCode=e1.getEmp_Id().compareTo(e2.getEmp_Id());
	    return returnCode;
	}
}

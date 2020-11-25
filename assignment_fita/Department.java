package com.java.training.assignment_fita;

import java.util.List;




public class Department {
	private int deptCode;
	private String DeptName;
//	 private final List <Employee> Employees; 
     
	    public Department (int deptCode, String DeptName) 
	    { 
//	        this.Employees = Employees;
	        this.deptCode= deptCode;
	        this.DeptName=DeptName;
	    } 
	    /**
		 * @return the deptCode
		 */
		public int getDeptCode() {
			return deptCode;
		}
		/**
		 * @return the deptName
		 */
		public String getDeptName() {
			return DeptName;
		}
//		public List<Employee> getTotalEmployeesInDepartment( )
//	{   
//	    return Employees; 
//	    } 

}

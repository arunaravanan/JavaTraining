package com.java.training.assignment2_fita;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
//Emp Id	Emp Name	Department	Manager Emp Id	Gross Salary [In INR]	Experience In Years
	private String emp_Id;
	private String emp_Name;
	private String dept;
	private String manager_Id;
	private int salary;
	private int exp;

	public String getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getManager_Id() {
		return manager_Id;
	}

	public void setManager_Id(String manager_Id) {
		this.manager_Id = manager_Id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public static String getManager(String manager_Id) {

		BufferedReader reader = null;
		String filePath = "C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\Employees.csv";
		String returnString = null;

		try {
			List<Employee> Employees = new ArrayList<Employee>();
			String line = "";

			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				if (fields.length > 0) {
					Employee e1 = new Employee();
					e1.setEmp_Id(fields[0]);
					e1.setEmp_Name(fields[1]);
					Employees.add(e1);

				}
			}
			for (Iterator<Employee> iterator = Employees.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();
				if (employee.emp_Id.equals(manager_Id))
					returnString = employee.getEmp_Name();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (returnString == null)
			returnString = "None";
		return returnString;

	}

	@Override
	public String toString() {
		return "Employee Id: " + emp_Id + " Name: " + String.format("%-19s", emp_Name) + "\nDepartment: " + String.format("%-9s", dept) + " Manager: "
				+ String.format("%-16s", getManager(this.manager_Id)) + " Gross Salary: INR " + salary + " Experience: " + exp+" years\n";
	}

//	Employee ID: A135 Name: Aruna Surendar
//	Department: Sales Manager: Asif Mustafa//////////tostring format
//	Gross Salary: INR 2350000 Experience: 11 years

}

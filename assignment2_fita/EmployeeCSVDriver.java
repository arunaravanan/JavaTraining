package com.java.training.assignment2_fita;

import java.io.*;
import java.util.*;

public class EmployeeCSVDriver {
	public static void main(String[] args) {
//		C:\Users\Bcp\eclipse-workspace\training\src\com\java\training\assignment2_fita
		String filePath = "C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\Employees.csv";
		System.out.println("starting read Employees.csv file");
		readCsv(filePath);
		System.out.printf("Sales Dept. Total Salary = INR %d \n", getTotalSalaryForDepartment("Sales"));
		ArrayList<Employee> Employees = getList(filePath);
		ComparatorClass Comp = new ComparatorClass("Department");
		Collections.sort(Employees, Comp);
		writeCsv(
				"C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\SortedEmployees.csv",
				Employees);
		getEligibleEmployees("Sales", 15);// the integer parameter can take either salary or exp depending on range
		
		changeManager("Sundar Ramanujam", "Anshuman Gupta");//emp name,updated manager name
		deleteEmployee("A176");//Emp id
	}

	private static void changeManager(String empName, String manName) {
		String filePath = "C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\SortedEmployees.csv";
		ArrayList<Employee> employees = getList(filePath);
		String idOfMan = null;

		ArrayList<Employee> employees1 = new ArrayList<Employee>();
		for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getEmp_Name().equals(manName))
				idOfMan = employee.getEmp_Id();

		}
		for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getEmp_Name().equals(empName)) {
				employee.setManager_Id(idOfMan);
			}
			employees1.add(employee);

		}
		writeCsv(filePath, employees1);

	}

	private static void deleteEmployee(String string) {
		String filePath = "C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\SortedEmployees.csv";
		ArrayList<Employee> employees = getList(filePath);
		ArrayList<Employee> employees1 = new ArrayList<Employee>();
		for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getEmp_Id().equals(string))
				continue;
			employees1.add(employee);

		}
		for (Iterator<Employee> iterator = employees1.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if(employee.getManager_Id().equals(string))
					employee.setManager_Id(null);
		}
		writeCsv(filePath, employees1);

	}

	private static void getEligibleEmployees(String string, int i) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\Employees.csv";
		ArrayList<Employee> employees = getList(filePath);
		for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getDept().equals(string))
				if (i > 50) {
					if (employee.getSalary() >= i)
						System.out.println(employee);

				} else if (i < 50) {
					if (employee.getExp() >= i)
						System.out.println(employee);
				}

		}

	}

	private static ArrayList<Employee> getList(String filePath) {
		BufferedReader reader = null;
		ArrayList<Employee> Employees = new ArrayList<Employee>();

		try {

			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				if (fields.length > 0) {
					Employee e1 = new Employee();
					e1.setEmp_Id(fields[0]);
					e1.setEmp_Name(fields[1]);
					e1.setDept(fields[2]);
					e1.setManager_Id(fields[3]);
					e1.setSalary(Integer.parseInt(fields[4]));
					e1.setExp(Integer.parseInt(fields[5]));
					Employees.add(e1);
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return Employees;
	}

	public static int getTotalSalaryForDepartment(String Dept) {
		String filePath = "C:\\Users\\Bcp\\eclipse-workspace\\training\\src\\com\\java\\training\\assignment2_fita\\Employees.csv";
		int total = 0;
		List<Employee> Employees = getList(filePath);

		for (Iterator<Employee> iterator = Employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getDept().equals(Dept))
				total += employee.getSalary();
		}
		return total;

	}

	public static void writeCsv(String filePath, ArrayList<Employee> Employees) {

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(filePath);
			System.out.println("Writing SortedEmployees.csv..");

			fileWriter.append("Emp Id, Emp Name, Department, Manager Id, Gross Salary, Experience\n");
			for (Employee u : Employees) {
				fileWriter.append(String.valueOf(u.getEmp_Id()));
				fileWriter.append(",");
				fileWriter.append(u.getEmp_Name());
				fileWriter.append(",");
				fileWriter.append(u.getDept());
				fileWriter.append(",");
				fileWriter.append(u.getManager_Id());
				fileWriter.append(",");
				fileWriter.append(String.valueOf(u.getSalary()));
				fileWriter.append(",");
				fileWriter.append(String.valueOf(u.getExp()));
				fileWriter.append("\n");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Writing Completed..");

	}

	public static void readCsv(String filePath) {
		List<Employee> Employees = getList(filePath);

		for (Employee e : Employees)
			System.out.println(e);

	}
}

package Assignment_1;

import java.util.Scanner;

public class Employee {
	
	Scanner s = new Scanner(System.in);
	
	String employeeName;
	int employeeID;
	String position;
	double salary;
	
	public Employee() {
		System.out.println("Please enter the employee's details");
	}
	
	public Employee(String emName) {
		this.employeeName = emName;
		System.out.print("Enter employee name : ");
		emName = s.next();
		System.out.println();
	}
	
	public Employee(String emName, int emID) {
		this.employeeName = emName;
		this.employeeID = emID;
		
		System.out.print("Enter employee name : ");
		emName = s.next();
		System.out.print("Enter employee ID   : ");
		emID = s.nextInt();
		System.out.println();
	}
	
	public Employee(String emName, int emID, String emPos, double emSal) {
		this.employeeName = emName;
		this.employeeID = emID;
		this.position = emPos;
		this.salary = emSal;
		
		System.out.print("Enter employee name : ");
		emName = s.next();
		System.out.print("Enter employee ID   : ");
		emID = s.nextInt();
		System.out.print("Enter position      : ");
		emPos = s.next();
		System.out.print("Enter salary        : RM");
		emSal = s.nextDouble();
		System.out.println();
	}
	
	public void setEmployeeName (String emName) {
		this.employeeName = emName;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public void setEmployeeID (int emID) {
		this.employeeID = emID;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public void setPosition (String emPos) {
		this.position = emPos;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void setSalary (double emSal) {
		this.salary = emSal;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void employeeInfo() {
		System.out.println("Employee name : " + this.employeeName
						 + "\nEmployee ID : " + this.employeeID
						 + "\nPosition    : " + this.position);
		System.out.printf("Salary      : RM%.2f" , this.salary);
	}

}

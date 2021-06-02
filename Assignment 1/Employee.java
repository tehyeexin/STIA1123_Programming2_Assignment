package Assignment_1;

import java.util.Scanner;

public class Employee { //1.3 - User Define Class
	
	Scanner s = new Scanner(System.in);
	
	//1.2 - Pre-Define Class
	String employeeName;
	int employeeID;
	long employeeIC;
	char gender;
	int age;
	long employeePhNum;
	String position;
	double salary;
	
	public Employee() { //1.4 - Constructor with no argument
		System.out.println("---------- EMPLOYEE ----------");
	}
	
	public Employee(String emName) { //1.4 - Constructor with 1 argument
		this.employeeName = emName;
		
		System.out.println("---------- EMPLOYEE ----------");
		System.out.println("Employee name : " + this.employeeName);
	}
	
	public Employee(String emName, int emID) { //1.4 - Constructor with 2 argument
		this.employeeName = emName;
		this.employeeID = emID;
		
		System.out.println("---------- EMPLOYEE ----------");
		System.out.println("Employee name : " + this.employeeName + "\nEmployee ID : " + this.employeeID);
		
		if (this.employeeName == "Teh Yee Xin" && this.employeeID == 602876) {
			System.out.println("Allowed to manage employee information.");
			System.out.println();
			manageEmployeeInfo();
		}
		else {
			System.out.println("Not allowed to manage employee information.");
		}
	}	
	
	public void manageEmployeeInfo() {
		System.out.println("Please enter the employee information.\n");
		
		System.out.print("Enter employee name         : ");
		this.employeeName = s.next();
		System.out.print("Enter employee ID           : ");
		this.employeeID = s.nextInt();
		System.out.print("Enter employee IC           : ");
		this.employeeIC = s.nextLong();
		System.out.print("Enter employee gender       : ");
		this.gender = s.next().charAt(0);
		System.out.print("Enter employee age          : ");
		this.age = s.nextInt();
		System.out.print("Enter employee phone number : ");
		this.employeePhNum = s.nextLong();
		System.out.print("Enter employee position     : ");
		this.position = s.next();
		System.out.print("Enter employee salary       : RM");
		this.salary = s.nextDouble();
		
		System.out.println("\nPlease enter 0 to confirm.");
		int confirm = s.nextInt();
		if(confirm == 0) {
			System.out.println("Employee information managed successfully.");
			System.out.println();
			printEmployeeInfo();
		}
		else {
			System.out.println("Employee information managed unsuccessfully. Please exit and re-enter.");
		}
	}
	
	public void printEmployeeInfo() {
		System.out.println("- Employeee Information -");
		System.out.println("Employee name         : " + this.employeeName
						 + "\nEmployee ID           : " + this.employeeID
						 + "\nEmployee IC           : " + this.employeeIC
						 + "\nEmployee gender       : " + this.gender
						 + "\nEmployee age          : " + this.age
						 + "\nEmployee phone number : " + this.employeePhNum
						 + "\nEmployee position     : " + this.position);
		System.out.printf("Employee salary       : RM%.2f" , this.salary);
	}

}

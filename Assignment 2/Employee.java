package Assignment_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Employee { //2.1 - Inheritance & 2.4 - Abstraction
	
	Scanner s = new Scanner(System.in);
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	String employeeName;
	int employeeID;
	long employeeIC;
	char gender;
	int age;
	long employeePhNum;
	String position;
	double salary;
	
	public Employee(String emName, int emID) { 
		this.employeeName = emName;
		this.employeeID = emID;
		setPosition("Manager");
		
		System.out.println("---------- EMPLOYEE ----------");
		System.out.println("Employee name : " + this.employeeName 
						 + "\nEmployee ID   : " + this.employeeID);
		
		if (this.employeeName == "Teh Yee Xin" && this.employeeID == 602876) {
			System.out.println("Position      : " + getPosition());
			System.out.println("\nAllowed to manage employee information.");
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
		this.employeeName = s.nextLine();
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
		}
		else {
			System.out.println("Employee information managed unsuccessfully. Please exit and re-enter.");
		}
	}
	
	//2.2 - Polymorphism
	public void printInfo() { //overriding
		System.out.println("- Employeee Information -"
						 + "\nEmployee name         : " + getEmployeeName()
						 + "\nEmployee ID           : " + getEmployeeID()
						 + "\nEmployee IC           : " + getEmployeeIC()
						 + "\nEmployee gender       : " + getGender()
						 + "\nEmployee age          : " + getAge()
						 + "\nEmployee phone number : " + getEmployeePhNum()
						 + "\nEmployee position     : " + getPosition()
						 + "\nEmployee salary       : RM" + df2.format(getSalary()));
	}
	
	//2.4 - Abstraction
	public abstract void calEmployeeSalary();
	
	//2.3 - Encapsulation
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
	
	public void setEmployeeIC (long emIC) {
		this.employeeIC = emIC;
	}
	
	public long getEmployeeIC() {
		return this.employeeIC;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setEmployeePhNum(long emPhNum) {
		this.employeePhNum = emPhNum;
	}
	
	public long getEmployeePhNum() {
		return this.employeePhNum;
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

}

package Assignment_2;

import java.util.Scanner;

public class Finance extends Employee implements Payment { //2.1 - Inheritance & 2.5 - Interface

	Scanner s = new Scanner(System.in);
	
	double income;
	double inventoryPurchase;
	double incidentalCharges;
	double totalEmployeeSalary;
	
	public Finance(String emName, int emID) { //constructor with 2 arguments
		super(emName, emID); //variables from super class - Employee
		
		System.out.println("\n\n---------- FINANCE ----------"); 
		System.out.println("Please enter the financial details.\n");
		
		calEmployeeSalary();
		System.out.println();
		
		System.out.print("Enter total monthly income              : RM");
		this.income = s.nextDouble();
		System.out.print("Enter total monthly purchase            : RM");
		this.inventoryPurchase = s.nextDouble(); 
		System.out.print("Enter total monthly incidental charges  : RM");
		this.incidentalCharges = s.nextDouble();
		System.out.print("Enter total monthly salary of employees : RM");
		this.totalEmployeeSalary = s.nextDouble();
		
		System.out.println("\nPlease enter 0 to confirm.");
		int confirm = s.nextInt();
		if(confirm == 0) {
			System.out.println("Financial details updated successfully.");
			System.out.println();
		}
		else {
			System.out.println("Financial details updated unsuccessfully. Please exit and re-enter.");
		}
		
		System.out.println();
		printInfo();
	}
	
	//2.2 - Polymorphism
	public void printInfo() { //overriding
		super.printInfo();
		System.out.println("\n");
		System.out.print("- Financial Details -"
						+"\nEnter total monthly income              : RM" + df2.format(getIncome())
						+"\nEnter total monthly purchase            : RM" + df2.format(getInventoryPurchase())
						+"\nEnter total monthly incidental charges  : RM" + df2.format(getIncidentalCharges())
						+"\nEnter total monthly salary of employees : RM" + df2.format(getTotalEmployeeSalary())
						+"\n\nTotal payment of the month : RM" + df2.format(getPayment())
						+"\nTotal profit of the month  : RM" + df2.format(totalProfit(getTotalEmployeeSalary())));
	}
	
	//2.4 - Abstraction
	public void calEmployeeSalary() { //abstract method from super class with body, calculate total employees' salary
		System.out.print("Enter numbers of employees : ");
		int employeeNum = s.nextInt();
		double sum = 0;
		for(int i = 1; i <= employeeNum; i++) {
			System.out.print("Enter salary of employee " + i + " : RM");
			double employeeSalary = s.nextDouble();
			sum+=employeeSalary;
		}
		System.out.println("Total monthly salary of employees : RM" + df2.format(sum));
	}
	
	public double totalProfit(double totalSalary) { //calculate total profit
		return this.income - this.inventoryPurchase - this.incidentalCharges - totalSalary;
	}
	
	//2.3 - Encapsulation
	public void setIncome (double income) {
		this.income = income;
	}
	
	public double getIncome() {
		return this.income;
	}
	
	public void setInventoryPurchase(double invPurchase) {
		this.inventoryPurchase = invPurchase;
	}
	
	public double getInventoryPurchase() {
		return this.inventoryPurchase;
	}
	
	public void setIncidentalCharges(double charges) {
		this.incidentalCharges = charges;
	}
	
	public double getIncidentalCharges() {
		return this.incidentalCharges;
	}
	
	public void setTotalEmployeeSalary(double totalEmSalary) {
		this.totalEmployeeSalary= totalEmSalary;
	}
	
	public double getTotalEmployeeSalary() {
		return this.totalEmployeeSalary;
	}
	
	//2.5 - Interface
	public double getPayment() { 
		return getInventoryPurchase() + getIncidentalCharges() + getTotalEmployeeSalary();
	}

}

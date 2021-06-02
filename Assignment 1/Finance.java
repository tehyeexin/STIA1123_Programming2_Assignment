package Assignment_1;

import java.util.Scanner;

public class Finance { //1.3 - User Define Class
	
	Scanner s = new Scanner(System.in);
	
	//1.2 - Pre-Define Class
	double income;
	double inventoryPurchase;
	double incidentalCharges;
	double totalEmployeeSalary;
	
	public Finance() { //1.4 - Constructor with no argument
		System.out.println("---------- FINANCE ----------");
	}
	
	public Finance(double income) { //1.4 - Constructor with 1 argument
		this.income = income;
		System.out.println("---------- FINANCE ----------");
		System.out.print("Enter monthly income : RM");
		income = s.nextDouble();
	}
	
	public Finance(double income, double invPurchase) { //1.4 - Constructor with 2 argument
		this.income = income;
		this.inventoryPurchase = invPurchase;
		System.out.println("---------- FINANCE ----------");
		System.out.print("Enter total monthly income   : RM");
		income = s.nextDouble();
		System.out.print("Enter total monthly purchase : RM");
		income = s.nextDouble();
	}
	
	public Finance(double income, double invPurchase, double charges, double totalEmSalary) { //1.4 - Constructor with 4 argument
		this.income = income;
		this.inventoryPurchase = invPurchase;
		this.incidentalCharges = charges;
		this.totalEmployeeSalary = totalEmSalary;
		System.out.println("---------- FINANCE ----------");
		System.out.print("Enter total monthly income              : RM");
		income = s.nextDouble();
		System.out.print("Enter total monthly purchase            : RM");
		income = s.nextDouble(); 
		System.out.print("Enter total monthly incidental charges  : RM");
		charges = s.nextDouble();
		System.out.print("Enter total monthly salary of employees : RM");
		charges = s.nextDouble();
		System.out.printf("Total profit of the month               : RM%.2f", totalProfit());
	}
	
	public double totalProfit() {
		return this.income - this.inventoryPurchase - this.incidentalCharges - this.totalEmployeeSalary;
	}

}

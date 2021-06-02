package Assignment_1;

import java.util.Scanner;

public class Inventory { //1.3 - User Define Class
	
	Scanner s = new Scanner(System.in);
	
	//1.2 - Pre-Define Class
	String material;
	int quantity;
	double price;
	
	public Inventory() { //1.4 - Constructor with no argument
		System.out.println("---------- INVENTORY ----------");
	}
	
	public Inventory(String mat) { //1.4 - Constructor with 1 argument
		this.material = mat;
		System.out.println("---------- INVENTORY ----------");
		System.out.print("Enter material purchased : ");
		mat = s.next();	
	}
	
	public Inventory(String mat, int qty) { //1.4 - Constructor with 2 argument
		this.material = mat;
		this.quantity = qty;
		System.out.println("---------- INVENTORY ----------");
		System.out.print("Enter material purchased : ");
		mat = s.next();	
		System.out.print("Enter quantity purchased : ");
		qty = s.nextInt();	
	}
	
	public Inventory(String mat, int qty, double price) { //1.4 - Constructor with 3 argument
		this.material = mat;
		this.quantity = qty;
		this.price = price;
		System.out.println("---------- INVENTORY ----------");
		System.out.print("Enter material purchased    : ");
		mat = s.next();	
		System.out.print("Enter quantity purchased    : ");
		qty = s.nextInt();	
		System.out.print("Enter price of the material : RM");
		price = s.nextDouble();	
		
		System.out.println("\nPlease enter 0 to confirm.");
		int confirm = s.nextInt();
		if(confirm == 0) {
			System.out.println("Inventory details updated successfully.");
			System.out.println();
			printInventoryInfo();
		}
		else {
			System.out.println("Inventory details updated unsuccessfully. Please exit and re-enter.");
		}
	}
	
	public double totalPurchase() {
		return this.quantity * this.price;
	}
	
	public void printInventoryInfo() {
		System.out.println("- Inventory Details -");
		System.out.println("Name of material     : " + this.material
						 +"\nQuantity of purchase : " + this.quantity);
		System.out.printf("Price of purchase    : RM%.2f" , this.price);
		System.out.printf("\nTotal purchase       : RM%.2f" , totalPurchase());
	}

}

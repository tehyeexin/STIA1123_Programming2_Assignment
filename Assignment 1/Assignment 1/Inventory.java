package Assignment_1;

import java.util.Scanner;

public class Inventory {
	
	Scanner s = new Scanner(System.in);
	
	String material;
	int quantity;
	double price;
	
	public Inventory() {
		
	}
	
	public Inventory(String mat) {
		this.material = mat;
		System.out.print("Enter material purchased : ");
		mat = s.next();	
	}
	
	public Inventory(String mat, int qty) {
		this.material = mat;
		this.quantity = qty;
		System.out.print("Enter material purchased : ");
		mat = s.next();	
		System.out.print("Enter quantity purchased : ");
		qty = s.nextInt();	
	}
	
	public Inventory(String mat, int qty, double price) {
		this.material = mat;
		this.quantity = qty;
		this.price = price;
		System.out.print("Enter material purchased    : ");
		mat = s.next();	
		System.out.print("Enter quantity purchased    : ");
		qty = s.nextInt();	
		System.out.print("Enter price of the material : RM");
		price = s.nextDouble();	
		System.out.printf("Total purchase : RM%.2f" , totalPurchase());
	}
	
	public void setMaterial (String mat) {
		this.material = mat;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setQuantity (int qty) {
		this.quantity = qty;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double totalPurchase() {
		return this.quantity * this.price;
	}

}

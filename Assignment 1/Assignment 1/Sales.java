package Assignment_1;

import java.util.Scanner;

public class Sales {
	
	Scanner s = new Scanner(System.in);
	
	String itemCode;
	int quantity;
	double price;
	
	public Sales() {
		
	}
	
	public Sales(String itemCo) {
		this.itemCode = itemCo;
		System.out.print("Enter the code of product you want to purchase : ");
		itemCo = s.next();	
		System.out.println("\nCode : " + itemCo);
	}
	
	public Sales(String itemCo, int qty) {
		this.itemCode = itemCo;
		this.quantity = qty;
		System.out.print("Enter the code of product you want to purchase : ");
		itemCo = s.next();	
		System.out.print("Enter the quantity you want to purchase        : ");
		qty = s.nextInt();	
		System.out.println("\nCode        : " + itemCo);
		System.out.println("Quantity    : " + qty);
		
		//BUN
		if (this.itemCode == "B01" || this.itemCode == "b01") {
			this.price = 3.50;
			System.out.println("Name        : Mexico Coffee Bun"
								+ "\nPrice       : RM3.50");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
		
		else if (this.itemCode == "B02" || this.itemCode == "b02") {
			this.price = 4.00;
			System.out.println("Name        : Ham and Cheese Bun"
								+ "\nPrice       : RM4.00");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
		
		else if (this.itemCode == "B03" || this.itemCode == "b03") {
			this.price = 3.80;
			System.out.println("Name        : Red Bean Bun"
								+ "\nPrice       : RM3.80");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
		
		//TART
		else if (this.itemCode == "T01" || this.itemCode == "t01") {
			this.price = 2.40;
			System.out.println("Name        : Portuguese Egg Tart"
								+ "\nPrice       : RM2.40");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
		
		else if (this.itemCode == "T02" || this.itemCode == "t02") {
			this.price = 2.80;
			System.out.println("Name        : Chocolate Almond Tart"
								+ "\nPrice       : RM2.80");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
	
		else if (this.itemCode == "T03" || this.itemCode == "t03") {
			this.price = 3.10;
			System.out.println("Name        : Blueberry Cheese Tart"
								+ "\nPrice       : RM3.10");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
	
		//CAKE
		else if (this.itemCode == "C01" || this.itemCode == "c01") {
			this.price = 14.90;
			System.out.println("Name        : Hokkaido Triple Cheese Cake"
								+ "\nPrice       : RM14.90");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
	
		else if (this.itemCode == "C02" || this.itemCode == "c02") {
			this.price = 11.90;
			System.out.println("Name        : Moist Chocolate Cake "
								+ "\nPrice       : RM11.90");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
		
		else if (this.itemCode == "C03" || this.itemCode == "c03") {
			this.price = 18.90;
			System.out.println("Name        : Matcha Ice Cream Cake"
								+ "\nPrice       : RM18.90");
			System.out.printf("Total price : RM%.2f" , totalPrice());
			System.out.println();
			discount();
		}
	}
	
	public void setItemCode (String itemCo) {
		this.itemCode = itemCo;
	}
	
	public String getItemCode() {
		return this.itemCode;
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
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public void discount() {
		if(totalPrice() < 50) {
			System.out.printf("Total purchase is RM%.2f", totalPrice());
		}
		
		else if(totalPrice() >= 50 && totalPrice() < 100) {
			System.out.println("Your total purchase is RM50 and above! We have a 5% discount for you!");
			double discount = 0.05;
			double latestPurchase = totalPrice() * (1 - discount);
			System.out.printf("Total purchase is RM%.2f", latestPurchase);
		}
		else {
			System.out.println("Your total purchase is RM100 and above! We have a 10% discount for you!");
			double discount = 0.1;
			double latestPurchase = totalPrice() * (1 - discount);
			System.out.printf("Total purchase is RM%.2f", latestPurchase);
		}
	}
	
	

}

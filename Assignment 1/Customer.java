package Assignment_1;

import java.util.Scanner;

public class Customer { //1.3 - User Define Class

	Scanner s = new Scanner(System.in);
	
	//1.2 - Pre-Define Class
	String customerName;
	String customerPhNum;
	String address;
	String itemCode; //code of the item customer want to purchase
	int quantity; // quantity customer want to purchase
	double price;
	int orderMethod;
	
	public Customer() { //1.4 - Constructor with no argument
		System.out.println("---------- CUSTOMER ----------");
		System.out.println("Please provide us with your information.");
	}
	
	public Customer(String custName) { //1.4 - Constructor with 1 argument
		this.customerName = custName;
		System.out.println("---------- CUSTOMER ----------");
		System.out.println("Please provide us with your information.");
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.println();
	}
	
	public Customer(String custName, String phNum) { //1.4 - Constructor with 2 argument
		this.customerName = custName;
		this.customerPhNum = phNum;
		System.out.println("---------- CUSTOMER ----------");
		System.out.println("Please provide us with your information.");
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.print("Enter phone number  : ");
		phNum = s.next();
		System.out.println();
	}
	
	public Customer(String custName, String phNum, String addr) { //1.4 - Constructor with 3 argument
		this.customerName = custName;
		this.customerPhNum = phNum;
		this.address = addr;
		
		System.out.println("---------- CUSTOMER ----------");
		System.out.println("Please provide us with your information.");
		System.out.print("Enter customer name : ");
		custName = s.nextLine();
		System.out.print("Enter phone number  : ");
		phNum = s.nextLine();
		System.out.print("Enter address       : ");
		addr = s.nextLine();
		System.out.println();
		customerOrder();
		printOrderInfo();
	}
	
	public void customerOrder() {
		System.out.println("Place your order here.");
		System.out.println("\nCode   Name                            Price"
							 + "\nB01    Mexico Coffee Bun               RM3.50" 
							 + "\nB02    Ham and Cheese Bun              RM4.00" 
							 + "\nB03    Red Bean Bun                    RM3.80"
							 + "\nT01    Portuguese Egg Tart             RM2.40" 
				 	 		 + "\nT02    Chocolate Almond Tart           RM2.80" 
				 	 		 + "\nT03    Blueberry Cheese Tart           RM3.10"
				 	 		 + "\nC01    Hokkaido Triple Cheese Cake     RM14.90" 
							 + "\nC02    Moist Chocolate Cake            RM11.90" 
							 + "\nC03    Matcha Ice Cream Cake           RM18.90");
		
		System.out.print("\nEnter the product code to purchase        : ");
		this.itemCode = s.next();
		System.out.print("Enter the quantity that wants to purchase : ");
		this.quantity = s.nextInt();
		
		System.out.print("\nSelect your preference. Food Delivery or Self Pick Up ? "
							+ "\nEnter '1' for Food Delivery / Enter '2' for Self Pick Up : ");
		this.orderMethod = s.nextInt();
		if(this.orderMethod == 1) {
			System.out.println("You had choose : Food Delivery");
		}
		else if(this.orderMethod == 2) {
			System.out.println("You had choose : Self Pick Up");
		}
		System.out.println();
	}
	
	public void printOrderInfo() {
		System.out.println("- Customer's Order Summary -");
		System.out.println("Name              : " + this.customerName
						 + "\nPhone number      : " + this.customerPhNum
						 + "\nAddress           : " + this.address);
		
		if(this.orderMethod == 1) {
			System.out.println("Remark            : Food Delivery");
		}
		else if(this.orderMethod == 2) {
			System.out.println("Remark            : Self Pick Up");
		}
		
		//BUN
		switch(this.itemCode) {
			case "B01" :
				this.price = 3.50;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Mexico Coffee Bun"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM3.50");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
		
			case "B02" :
				this.price = 4.00;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Ham and Cheese Bun"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM4.00");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
		
			case "B03" :
				this.price = 3.80;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Red Bean Bun"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM3.80");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
				
		//TART
			case "T01" :
				this.price = 2.40;
				System.out.println("Ordered item code : " + this.itemCode
						 	 + "\nOrdered item name : Portuguese Egg Tart"
						 	 + "\nOrdered quantity  : " + this.quantity
						 	 + "\nPrice per unit    : RM2.40");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
		
			case "T02" :
				this.price = 2.80;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Chocolate Almond Tart"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM2.80");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
	
			case "T03" :
				this.price = 3.10;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Blueberry Cheese Tart"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM3.10");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
	
		//CAKE
			case "C01" :
				this.price = 14.90;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Hokkaido Triple Cheese Cake"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM14.90");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
				
			case "C02" :
				this.price = 11.90;
				System.out.println("Ordered item code : " + this.itemCode
					 		 + "\nOrdered item name : Moist Chocolate Cake"
					 		 + "\nOrdered quantity  : " + this.quantity
					 		 + "\nPrice per unit    : RM11.90");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
		
			case "C03" :
				this.price = 18.90;
				System.out.println("Ordered item code : " + this.itemCode
							 + "\nOrdered item name : Matcha Ice Cream Cake"
							 + "\nOrdered quantity  : " + this.quantity
							 + "\nPrice per unit    : RM18.90");
				System.out.printf("Total price       : RM%.2f" , totalPrice());
				System.out.println();
				discount();
				break;
		}
	}
	
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public void discount() {
		if(totalPrice() < 30) {
			System.out.printf("\nYour total purchase is RM%.2f", totalPrice());
		}
		
		else if(totalPrice() >= 30 && totalPrice() < 50) {
			System.out.println("\nYour had purchased RM30 and above! We have a 5% discount for you!");
			double discount = 0.05;
			double latestPurchase = totalPrice() * (1 - discount);
			System.out.printf("Now, your total purchase is RM%.2f", latestPurchase);
		}
		else {
			System.out.println("\nYour had purchased RM50 and above! We have a 10% discount for you!");
			double discount = 0.1;
			double latestPurchase = totalPrice() * (1 - discount);
			System.out.printf("Now, your total purchase is RM%.2f", latestPurchase);
		}
	}
}

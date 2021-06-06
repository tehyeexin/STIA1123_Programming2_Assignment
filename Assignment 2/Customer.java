package Assignment_2;

import java.util.Scanner;

public class Customer extends ProductDescription implements Payment { //2.1 - Inheritance & 2.5 - Interface

	Scanner s = new Scanner(System.in);
	
	String customerName;
	String customerPhNum;
	String address;
	String itemCode; //code of the item customer want to purchase
	int quantity; // quantity customer want to purchase
	double price;
	int orderMethod;
	
	public Customer(String itemCat, String itemCo) {
		super(itemCat, itemCo);
	
		printInfo();
		System.out.println();
		customerOrder();
		printOrderInfo();
	}
	
	//2.2 - Polymorphism
	public void printInfo() { //overriding
		super.printInfo();
		System.out.println("\n\n---------- CUSTOMER ----------");
		System.out.println("Please provide us with your information.");
		System.out.print("Enter customer name : ");
		this.customerName = s.nextLine();
		System.out.print("Enter phone number  : ");
		this.customerPhNum = s.nextLine();
		System.out.print("Enter address       : ");
		this.address = s.nextLine();
	}
	
	//2.4 - Abstraction
	public void customerOrder() { //abstract method from super class with body
		System.out.println("What is your choice? Place your order here.");
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
		System.out.println("Name              : " + getCustomerName()
						 + "\nPhone number      : " + getCustomerPhNumber()
						 + "\nAddress           : " + getAddress());
		
		if(this.orderMethod == 1) {
			System.out.println("Remark            : Food Delivery");
		}
		else if(this.orderMethod == 2) {
			System.out.println("Remark            : Self Pick Up");
		}
		
		//BUN
		switch(this.itemCode) {
			case "B01" :
				setPrice(3.50);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Mexico Coffee Bun"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM3.50");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
		
			case "B02" :
				setPrice(4.00);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Ham and Cheese Bun"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM4.00");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
		
			case "B03" :
				setPrice(3.80);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Red Bean Bun"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM3.80");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
				
		//TART
			case "T01" :
				setPrice(2.40);
				System.out.println("Ordered item code : " + getItemCode()
						 	 + "\nOrdered item name : Portuguese Egg Tart"
						 	 + "\nOrdered quantity  : " + getQuantity()
						 	 + "\nPrice per unit    : RM2.40");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
		
			case "T02" :
				setPrice(2.80);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Chocolate Almond Tart"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM2.80");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
	
			case "T03" :
				setPrice(3.10);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Blueberry Cheese Tart"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM3.10");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
	
		//CAKE
			case "C01" :
				setPrice(14.90);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Hokkaido Triple Cheese Cake"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM14.90");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
				
			case "C02" :
				setPrice(11.90);
				System.out.println("Ordered item code : " + getItemCode()
					 		 + "\nOrdered item name : Moist Chocolate Cake"
					 		 + "\nOrdered quantity  : " + getQuantity()
					 		 + "\nPrice per unit    : RM11.90");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
		
			case "C03" :
				setPrice(18.90);
				System.out.println("Ordered item code : " + getItemCode()
							 + "\nOrdered item name : Matcha Ice Cream Cake"
							 + "\nOrdered quantity  : " + getQuantity()
							 + "\nPrice per unit    : RM18.90");
				System.out.printf("Total price       : RM%.2f" , getPayment());
				System.out.println();
				discount();
				break;
		}
	}
	
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public void discount() {
		if(getPayment() < 30) {
			System.out.printf("\nYour total purchase is RM%.2f", getPayment());
		}
		
		else if(getPayment() >= 30 && getPayment() < 50) {
			System.out.println("\nYour had purchased RM30 and above! We have a 5% discount for you!");
			double discount = 0.05;
			double latestPurchase = getPayment() * (1 - discount);
			System.out.printf("Now, your total purchase is RM%.2f", latestPurchase);
		}
		else {
			System.out.println("\nYour had purchased RM50 and above! We have a 10% discount for you!");
			double discount = 0.1;
			double latestPurchase = getPayment() * (1 - discount);
			System.out.printf("Now, your total purchase is RM%.2f", latestPurchase);
		}
	}
	
	//2.3 - Encapsulation
	public void setCustomerName (String custName) {
		this.customerName = custName;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerPhNumber (String phNum) {
		this.customerPhNum = phNum;
	}
	
	public String getCustomerPhNumber() {
		return this.customerPhNum;
	}
	
	public void setAddress (String addr) {
		this.address = addr;
	}
	
	public String getAddress() {
		return this.address;
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
	
	public void setOrderMethod (int orderMthd) {
		this.orderMethod = orderMthd;
	}
	
	public int getOrderMethod() {
		return this.orderMethod;
	}

	//2.5 - Interface
	public double getPayment() {
		return totalPrice();
	}

}

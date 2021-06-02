package Assignment_1;

import java.util.Scanner;

public class Customer {

	Scanner s = new Scanner(System.in);
	
	String customerName;
	long phoneNumber;
	String address;
	String itemCode; //code of the item customer want to purchase
	int quantity; // quantity customer want to purchase
	
	public Customer() {
		System.out.println("Please enter the customer's details");
	}
	
	public Customer(String custName) {
		this.customerName = custName;
		System.out.println("Please enter the customer's details");
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.println();
	}
	
	public Customer(String custName, long phNum) {
		this.customerName = custName;
		this.phoneNumber = phNum;
		
		System.out.println("Please enter the customer's details");
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.print("Enter phone number  : ");
		phNum = s.nextLong();
		System.out.println();
	}
	
	public Customer(String custName, long phNum, String addr) {
		this.customerName = custName;
		this.phoneNumber = phNum;
		this.address = addr;
		
		System.out.println("Please enter the customer's details");
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.print("Enter phone number  : ");
		phNum = s.nextLong();
		System.out.print("Enter address       : ");
		addr = s.next();
		
		System.out.println("Select your preference. Food Delivery or Self Pick Up ? "
							+ "\nEnter '1' for Food Delivery / Enter '2' for Self Pick Up");
		int orderMethod = s.nextInt();
		if(orderMethod == 1) {
			System.out.println("You had choose : Food Delivery");
		}
		else if(orderMethod == 2) {
			System.out.println("You had choose : Self Pick Up");
		}
		System.out.println();
	}
	
	public void setCustomerName (String custName) {
		this.customerName = custName;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setPhoneNumber (long phNum) {
		this.phoneNumber = phNum;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setAddress (String addr) {
		this.address = addr;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void customerInfo() {
		System.out.println("Customer name : " + this.customerName
						 + "\nPhone number  : " + this.phoneNumber
						 + "\nAddress       : " + this.address);
	}

}

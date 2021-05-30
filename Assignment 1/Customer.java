package Assignment_1;

import java.util.Scanner;

public class Customer {

	Scanner s = new Scanner(System.in);
	
	String customerName;
	String phoneNumber;
	String address;
	
	public Customer() {
		System.out.println("Please enter the customer's details");
	}
	
	public Customer(String custName) {
		this.customerName = custName;
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.println();
	}
	
	public Customer(String custName, String phNum) {
		this.customerName = custName;
		this.phoneNumber = phNum;
		
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.print("Enter phone number  : ");
		phNum = s.next();
		System.out.println();
	}
	
	public Customer(String custName, String phNum, String addr) {
		this.customerName = custName;
		this.phoneNumber = phNum;
		this.address = addr;
		
		System.out.print("Enter customer name : ");
		custName = s.next();
		System.out.print("Enter phone number  : ");
		phNum = s.next();
		System.out.print("Enter address       : ");
		addr = s.next();
		System.out.println();
	}
	
	public void setCustomerName (String custName) {
		this.customerName = custName;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setPhoneNumber (String phNum) {
		this.phoneNumber = phNum;
	}
	
	public String getPhoneNumber() {
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

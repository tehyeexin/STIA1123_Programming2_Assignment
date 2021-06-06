package Assignment_2;

public abstract class Bakery { //2.1 - Inheritance & 2.4 - Abstraction
	
	String shopName;
	int yearEstablished;
	
	public Bakery(String sName, int year) { 
		this.shopName = sName;
		this.yearEstablished = year;
		System.out.println("---------- BAKERY ----------");
	}

	//2.2 - Polymorphism
	public void printInfo() { //overriding
		System.out.println("Welcome to " + getShopName() + " !"
						 + "\n\n- About us -" 
						 + "\nEstablished in " + getYearEstablished() + "."
						 + "\nBased in Perak, Malaysia."
						 + "\n\n- Contact us -"
						 + "\nContact number : 05-8903253"
						 + "\nWebsite        : www.cherryontopbakery.com"
						 + "\n\nBaked with love. Let us be the Cherry On Top of your day!");
	}
	
	//2.4 - Abstraction
	public abstract void socialMedia(); //abstract method with no body
	
	//2.3 - Encapsulation
	public void setShopName (String sName) {
		this.shopName = sName;
	}
	
	public String getShopName() {
		return this.shopName;
	}
	
	public void setYearEstablished (int year) {
		this.yearEstablished = year;
	}
	
	public int getYearEstablished() {
		return this.yearEstablished;
	}

}

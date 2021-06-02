package Assignment_1;

public class Bakery { //1.3 - User Define Class
	
	//1.2 - Pre-Define Class
	String shopName;
	int yearEstablished;
	
	public Bakery() { //1.4 - Constructor with no argument
		this.shopName = "Cherry On Top Bakery";
	}
	
	public Bakery(String sName) { //1.4 - Constructor with 1 argument
		this.shopName = sName;
	}
	
	public Bakery(String sName, int year) { //1.4 - Constructor with 2 argument
		this.shopName = sName;
		this.yearEstablished = year;
		bakeryInfo();
	}
	
	public void bakeryInfo() {
		System.out.println("Welcome to " + this.shopName + " !"
						 + "\n\n- About us -" 
						 + "\nEstablished in " + this.yearEstablished + "."
						 + "\nBased in Perak, Malaysia."
						 + "\n\n- Contact us -"
						 + "\nContact number : 05-8903253"
						 + "\nFacebook       : Cherry On Top Bakery" 
						 + "\nInstagram      : @cherryontopbakery"  
						 + "\nTik Tok        : @cherryontopbakery" 
						 + "\nWebsite        : www.cherryontopbakery.com"
						 + "\n\nBaked with love. Let us be the Cherry On Top of your day!");
	}
	
}

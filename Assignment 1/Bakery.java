package Assignment_1;

public class Bakery {
	
	String shopName;
	int yearEstablished;
	
	public Bakery() {
		this.shopName = "Cherry On Top Bakery";
	}
	
	public Bakery(String sName) {
		this.shopName = sName;
	}
	
	public Bakery(String sName, int year) {
		this.shopName = sName;
		this.yearEstablished = year;
		bakeryInfo();
	}
	
	public void setStoreName (String sName) {
		this.shopName = sName;
	}
	
	public String getStoreName() {
		return this.shopName;
	}
	
	public void setYearEstablished (int year) {
		this.yearEstablished = year;
	}
	
	public int getYearEstablished() {
		return this.yearEstablished;
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

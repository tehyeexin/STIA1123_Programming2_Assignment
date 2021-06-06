package Assignment_2;

public class AdvertismentAndMarketing extends Bakery{ //2.1 - Inheritance
	
	String promotion;
	
	public AdvertismentAndMarketing(String sName, int year, String promo) { 
		super(sName, year);
		this.promotion = promo;
		printInfo();
		socialMedia();
	}
	
	//2.2 - Polymorphism
	public void printInfo() {
		super.printInfo();
		System.out.println("\n\n---------- ADVERTISMENT AND MARKETING ----------"
				 + "\nHi there! Here are some special for you!"
				 + "\n1. Discount for orders over RM30 and above!"
				 + "\n2. Free 1 Mexico Coffee Bun for you if self pick up order!"
				 + "\n3. Every purchase will get a 5% voucher for your next purchase! No minimun spend!"
				 + "\n\nWhat are you waiting for? Shop Now!");
	}
	
	//2.4 - Abstraction
	public void socialMedia() {
		System.out.println("\nFollow us on social media! Keep up to date with our latest updates!"
				 + "\nFacebook  : Cherry On Top Bakery" 
				 + "\nInstagram : @cherryontopbakery"  
				 + "\nTik Tok   : @cherryontopbakery");
	}
	
	//2.3 - Encapsulation
	public void setPromotion (String promo) {
		this.promotion = promo;
	}
	
	public String getItemCategory() {
		return this.promotion;
	}

}

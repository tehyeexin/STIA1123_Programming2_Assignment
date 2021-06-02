package Assignment_1;

public class AdvertismentAndMarketing {
	
	String promotion;
	String sales;
	
	public AdvertismentAndMarketing() {
		System.out.println("---------- ADVERTISMENT AND MARKETING ----------");
	}
	
	public AdvertismentAndMarketing(String promo) {
		this.promotion = promo;
		
		System.out.println("---------- ADVERTISMENT AND MARKETING ----------");
		promotionNotice();
	}
	
	public AdvertismentAndMarketing(String promo, String sales) {
		this.promotion = promo;
		this.sales = sales;
		
		System.out.println("---------- ADVERTISMENT AND MARKETING ----------");
		promotionNotice();
		System.out.println();
		juneSales();
		System.out.println();
		socialMedia();
	}
	
	public void promotionNotice() {
		System.out.println("\nHi there! Here are some special for you!"
				 + "\n1. Discount for orders over RM30 and above!"
				 + "\n2. Free 1 Mexico Coffee Bun for you if self pick up order!"
				 + "\n3. Every purchase will get a 5% voucher for your next purchase! No minimun spend!"
				 + "\n\nWhat are you waiting for? Shop Now!");
	}
	
	public void juneSales() {
		System.out.println("6.6 sales coming soon! Enjoy 66% only on 6th June for any products!");
	}
	
	public void socialMedia() {
		System.out.println("Follow us on social media! Keep up to date with our latest updates!"
						 + "\nFacebook  : Cherry On Top Bakery" 
						 + "\nInstagram : @cherryontopbakery"  
						 + "\nTik Tok   : @cherryontopbakery");
	}

}

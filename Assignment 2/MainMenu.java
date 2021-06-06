package Assignment_2;

public class MainMenu {

	public static void main(String[] args) {
		
		AdvertismentAndMarketing ad = new AdvertismentAndMarketing("Cherry On Top Bakery", 2021, "Promotion");
		System.out.println("\n");
		
		Customer customer = new Customer("Cake", "C03");
		System.out.println("\n\n");
		
		Inventory inventory = new Inventory();
		System.out.println("\n");
		
		Finance finance = new Finance("Teh Yee Xin", 602876);
		
	}

}

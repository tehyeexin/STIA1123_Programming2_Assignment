package Assignment_1;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bakery bakery = new Bakery("Cherry On Top Bakery", 2021);
		System.out.println();
		
		ProductDescription product = new ProductDescription("Cake", "C03");
		System.out.println();
		
		AdvertismentAndMarketing ad = new AdvertismentAndMarketing("Promotion", "Sales");
		System.out.println();
		
		Inventory inventory = new Inventory("Flour", 5, 3);
		System.out.println("\n");
		
		Employee employee = new Employee("Teh Yee Xin", 602876);
		System.out.println("\n");
		
		Finance finance = new Finance(18630, 2500, 1890, 7050);
		System.out.println("\n");
		
		Customer customer = new Customer("Wendy", "0165233979", "16, Jalan Taiping, 34400, Semanggol, Perak.");
		
		
		
		


	}

}

package Assignment_1;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bakery bakery = new Bakery("Cherry On Top Bakery", 2021);
		System.out.println();
		
		ProductDescription product = new ProductDescription("Tart", "T02");
		System.out.println();
		
		AdvertismentAndMarketing ad = new AdvertismentAndMarketing("Promotion", "Sales");
		System.out.println();
		
		Employee employee = new Employee("Teh Yee Xin", 602876);
		System.out.println("\n");
		
		/*System.out.println("* Customer *");
		Customer customer = new Customer("Wendy", "0175697752", "Changlun, UUM");
		customer.customerInfo();
		System.out.println();
		
		System.out.println("* Sales *");
		Sales sales = new Sales("B01", 100);
		System.out.println("\n");
		
		
		
		System.out.println("* Inventory *");
		Inventory inventory = new Inventory("Flour", 5, 3);
		System.out.println("\n");
		
		System.out.println("* Finance *");
		Finance finance = new Finance(21500, 1500, 9900);
		System.out.println();*/


	}

}

package Assignment_1;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bakery bakery = new Bakery("Blooming Bakery", 2021);
		bakery.bakeryInfo();
		System.out.println();
		
		System.out.println("* Product Description *");
		ProductDescription product = new ProductDescription("Bun", "B01");
		System.out.println();
		
		System.out.println("* Customer *");
		Customer customer = new Customer("Wendy", "0175697752", "Changlun, UUM");
		customer.customerInfo();
		System.out.println();
		
		System.out.println("* Employee *");
		Employee employee = new Employee("Mark", 94022252, "Baker", 2800.00);
		employee.employeeInfo();
		System.out.println("\n");
		
		System.out.println("* Sales *");
		Sales sales = new Sales("B01", 100);
		System.out.println("\n");
		
		System.out.println("* Advertisment and Marketing *");
		AdvertismentAndMarketing ad = new AdvertismentAndMarketing();
		ad.socialMedia(); 
		ad.massMedia(); 
		ad.printMedia();
		System.out.println();
		
		System.out.println("* Inventory *");
		Inventory inventory = new Inventory("Flour", 5, 3);
		System.out.println("\n");
		
		System.out.println("* Finance *");
		Finance finance = new Finance(21500, 1500, 9900);
		System.out.println();


	}

}

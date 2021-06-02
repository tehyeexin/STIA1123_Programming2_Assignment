package Assignment_1;

import java.util.*;

public class ProductDescription { //1.3 - User Define Class
	
	Scanner s = new Scanner(System.in);
	
	//1.2 - Pre-Define Class
	String itemCategory;
	String itemCode;
	
	public ProductDescription() { //1.4 - Constructor with no argument
		System.out.println("---------- PRODUCT DESCRIPTION ----------");
		System.out.println("Category : Bun" 
						 + "\n           Tart" 
					  	 + "\n           Cake");
		System.out.print("\nEnter a category to check the products provided : ");
		this.itemCategory = s.next();
		System.out.println("\nSelected category : " + itemCategory);
		System.out.println();
		
	}
	
	public ProductDescription(String itemCat) { //1.4 - Constructor with 1 argument
		this.itemCategory = itemCat;
		
		System.out.println("---------- PRODUCT DESCRIPTION ----------");
		System.out.println("Category : Bun" 
						 + "\n           Tart" 
						 + "\n           Cake");
		
		System.out.print("\nEnter a category to check the products provided : ");
		itemCat = s.next();
		System.out.println("\nSelected category : " + this.itemCategory);
		System.out.println();
		
		if (this.itemCategory == "Bun" || this.itemCategory == "bun") {
			System.out.println("Products provided in category - BUN" 
							 + "\nCode   Name                  Price");
			System.out.println("B01    Mexico Coffee Bun     RM3.50" 
							 + "\nB02    Ham and Cheese Bun    RM4.00" 
							 + "\nB03    Red Bean Bun          RM3.80");
			
		}
		
		else if (this.itemCategory == "Tart" || this.itemCategory == "tart") {
			System.out.println("Products provided in category - TART" 
					 		 + "\nCode   Name                      Price");
			System.out.println("T01    Portuguese Egg Tart       RM2.40" 
				 	 		 + "\nT02    Chocolate Almond Tart     RM2.80" 
				 	 		 + "\nT03    Blueberry Cheese Tart     RM3.10");
		}
		
		else if (this.itemCategory == "Cake" || this.itemCategory == "cake") {
			System.out.println("Products provided in category - CAKE" 
							 + "\nCode   Name                            Price");
			System.out.println("C01    Hokkaido Triple Cheese Cake     RM14.90" 
							 + "\nC02    Moist Chocolate Cake            RM11.90" 
							 + "\nC03    Matcha Ice Cream Cake           RM18.90");		
		}
	}
	
	public ProductDescription(String itemCat, String itemCo) { //1.4 - Constructor with 2 argument
		this.itemCategory = itemCat;
		this.itemCode = itemCo;
		
		System.out.println("---------- PRODUCT DESCRIPTION ----------");
		System.out.println("Category : Bun" 
				 		 + "\n           Tart" 
				 		 + "\n           Cake");

		System.out.print("\nEnter a category to check the products provided : ");
		itemCat = s.next();
		System.out.println("\nSelected category : " + this.itemCategory);
		System.out.println();
		
		if (this.itemCategory == "Bun" || this.itemCategory == "bun") {
			System.out.println("Products provided in category - BUN" 
							 + "\nCode   Name                  Price");
			System.out.println("B01    Mexico Coffee Bun     RM3.50" 
							 + "\nB02    Ham and Cheese Bun    RM4.00" 
							 + "\nB03    Red Bean Bun          RM3.80");
			
			System.out.print("\nEnter the product code to check the information : ");
			itemCo = s.next();
			System.out.println("\nSelected code : " + this.itemCode);
			
			if(this.itemCode == "B01" || this.itemCode == "b01") {
				bunInfo();
			}
			
			else if (this.itemCode == "B02" || this.itemCode == "b02") {
				bunInfo();
			}
			
			else if (this.itemCode == "B03" || this.itemCode == "b03") {
				bunInfo();
			}
		}
		
		else if (this.itemCategory == "Tart" || this.itemCategory == "tart") {
			System.out.println("Products provided in category - TART" 
							 + "\nCode   Name                      Price");
			System.out.println("T01    Portuguese Egg Tart       RM2.40" 
						 	 + "\nT02    Chocolate Almond Tart     RM2.80" 
							 + "\nT03    Blueberry Cheese Tart     RM3.10");
			
			System.out.print("\nEnter the product code to check the information : ");
			itemCo = s.next();
			System.out.println("\nSelected code : " + this.itemCode);
			
			if(this.itemCode == "T01" || this.itemCode == "t01") {
				tartInfo();
			}
			
			else if (this.itemCode == "T02" || this.itemCode == "t02") {
				tartInfo();
			}
			
			else if (this.itemCode == "T03" || this.itemCode == "t03") {
				tartInfo();
			}
		}
		
		else if (this.itemCategory == "Cake" || this.itemCategory == "cake") {
			System.out.println("Products provided in category - CAKE" 
							 + "\nCode   Name                            Price");
			System.out.println("C01    Hokkaido Triple Cheese Cake     RM14.90" 
								+ "\nC02    Moist Chocolate Cake            RM11.90" 
								+ "\nC03    Matcha Ice Cream Cake           RM18.90");	
			
			System.out.print("\nEnter the product code to check the information : ");
			itemCo = s.next();
			System.out.println("\nSelected code : " + this.itemCode);
			
			if(this.itemCode == "C01" || this.itemCode == "c01") {
				cakeInfo();
			}
			
			else if (this.itemCode == "C02" || this.itemCode == "c02") {
				cakeInfo();
			}
			
			else if (this.itemCode == "C03" || this.itemCode == "c03") {
				cakeInfo();
			}
		}
	}
	
	public void bunInfo() {
		if(this.itemCode == "B01" || this.itemCode == "b01") {
			System.out.println("\n- Mexican Coffe Bun -");
			System.out.println("Mexican Coffe Bun is a sweet bun with coffee topping and butter filling. "
								+ "\nIngredients : Flour, sugar, milk powder, butter, eggs, instant coffee, coffee essence"
								+ "\nCalories    : 580cal per serving");
		}
		
		else if (this.itemCode == "B02" || this.itemCode == "b02") {
			System.out.println("\n- Ham and Cheese Bunn -");
			System.out.println("Ham and Cheese Bun is a sweet bun with small pieces ham filling, grated cheddar cheese and mayonnaise topping."
								+ "\nIngredients : Flour, milk powder, sugar, salt,eggs, butter, ham, grated cheddar cheese, mayonnaise"
								+ "\nCalories    : 442cal per serving");
		}
		
		else if (this.itemCode == "B03" || this.itemCode == "b03") {
			System.out.println("\n- Red Bean Bun -");
			System.out.println("Red Bean Bun are sweet buns wrapped with red bean paste."
					+ "\nIngredients : Flour, milk powder, sugar, salt, eggs, butter, red bean, sesame seeds"
					+ "\nCalories    : 283cal per serving");
		}
	}
	
	public void tartInfo() {
		if(this.itemCode == "T01" || this.itemCode == "t01") {
			System.out.println("\n- Portuguese Egg Tart -");
			System.out.println("Crispy, flaky crust holding a creamy custard center, blisters on top from the high heat of an oven"
					+ "\nIngredients : Flour, butter, salt, sugar, milk, Eggs, whipping cream, vanilla extract"
					+ "\nCalories    : 292cal per serving");
		}
		
		else if (this.itemCode == "T02" || this.itemCode == "t02") {
			System.out.println("\n- Chocolate Almond Tart -");
			System.out.println("Coat crunchy toasted almond flakes in a thick base of cooking chocolate and lay them in a buttery tart shell."
					+ "\nIngredients : Toasted almonds, butter, eggs, sugar, flour, chocolate, heavy cream, salt, sliced almonds"
					+ "\nCalories    : 220cal per serving");
		}
		
		else if (this.itemCode == "T03" || this.itemCode == "t03") {
			System.out.println("\n- Blueberry Cheese Tart -");
			System.out.println("A rich and creamy cheesecake filling in a buttery shortcrust tart topped with blueberry filling."
					+ "\nIngredients : Butter, sugar, eggs, flour, cream cheese, lemon juice, blueberries filling"
					+ "\nCalories    : 275cal per serving");
		}
	}
	
	public void cakeInfo() {
		if(this.itemCode == "C01" || this.itemCode == "c01") {
			System.out.println("\n- Hokkaido Triple Cheese Cake -");
			System.out.println("Light, fluffy and moist, a truly magical combination of 3 types of premium cheese that melts in your mouth and is bursting with flavour."
					+ "\nIngredients : Flour, sugar, eggs, cream cheese, whipping cream"
					+ "\nCalories    : 230cal per seving");
		}
		
		else if (this.itemCode == "C02" || this.itemCode == "c02") {
			System.out.println("\n- Moist Chocolate Cake -");
			System.out.println("Fluffy and moist chocolate cake with a smooth mocha / coffee filling centre, finished with melted semi-sweet chocolate."
					+ "\nIngredients : Flour, sugar, cocoa powder, salt, eggs, buttermilk, butter, vanilla extract, coffee"
					+ "\nCalories    : 340cal per serving");
		}
		
		else if (this.itemCode == "C03" || this.itemCode == "c03") {
			System.out.println("\n- Matcha Ice Cream Cake -");
			System.out.println("Lotus Biscuit base and chocolate crumbles. Creamy matcha ice cream with chocolate cake in the middle."
					+ "\nIngredients : Matcha, egg, milk, cream, sugar, chocolate cake, lotus biscuit, butter"
					+ "\nCalories    : 250cal per serving");
		}
	}
}

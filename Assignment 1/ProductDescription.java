package Assignment_1;

import java.util.*;

public class ProductDescription {
	
	Scanner s = new Scanner(System.in);
	
	String itemCategory;
	String itemCode;
	//String itemName;
	//double itemPrice;
	
	public ProductDescription() {
		System.out.println("Category : Bun" 
						 + "\n           Tart" 
					  	 + "\n           Cake");
		System.out.println();
		
	}
	
	public ProductDescription(String itemCat) {
		this.itemCategory = itemCat;
		
		System.out.println("Category : Bun" 
						 + "\n           Tart" 
						 + "\n           Cake");
		
		System.out.print("\nEnter a category to check the products provided : ");
		itemCat = s.next();
		System.out.println("Category : " + itemCat);
		System.out.println();
		
		if (this.itemCategory == "Bun" || this.itemCategory == "bun") {
			System.out.println("Products provided in category BUN" 
							 + "\nCode   Name                  Price");
			System.out.println("B01    Mexico Coffee Bun     RM3.50" 
							 + "\nB02    Ham and Cheese Bun    RM4.00" 
							 + "\nB03    Red Bean Bun          RM3.80");
			
		}
		
		else if (this.itemCategory == "Tart" || this.itemCategory == "tart") {
			System.out.println("Products provided in category TART" 
					 		 + "\nCode   Name                      Price");
			System.out.println("T01    Portuguese Egg Tart       RM2.40" 
				 	 		 + "\nT02    Chocolate Almond Tart     RM2.80" 
				 	 		 + "\nT03    Blueberry Cheese Tart     RM3.10");
		}
		
		else if (this.itemCategory == "Cake" || this.itemCategory == "cake") {
			System.out.println("Products provided in category CAKE" 
							 + "\nCode   Name                            Price");
			System.out.println("C01    Hokkaido Triple Cheese Cake     RM14.90" 
							 + "\nC02    Moist Chocolate Cake            RM11.90" 
							 + "\nC03    Matcha Ice Cream Cake           RM18.90");		
		}
	}
	
	public ProductDescription(String itemCat, String itemCo) {
		this.itemCategory = itemCat;
		this.itemCode = itemCo;
		
		System.out.println("Category : Bun" 
				 		 + "\n           Tart" 
				 		 + "\n           Cake");

		System.out.print("\nEnter a category to check the products provided : ");
		itemCat = s.next();
		System.out.println("Category : " + itemCat);
		System.out.println();
		
		if (this.itemCategory == "Bun" || this.itemCategory == "bun") {
			System.out.println("Products provided in category BUN" 
							 + "\nCode   Name                  Price");
			System.out.println("B01    Mexico Coffee Bun     RM3.50" 
							 + "\nB02    Ham and Cheese Bun    RM4.00" 
							 + "\nB03    Red Bean Bun          RM3.80");
			
			System.out.print("\nEnter the product code to check the ingredients : ");
			itemCo = s.next();
			System.out.println("Code : " + itemCo);
			
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
			System.out.println("Products provided in category TART" 
							 + "\nCode   Name                      Price");
			System.out.println("T01    Portuguese Egg Tart       RM2.40" 
						 	 + "\nT02    Chocolate Almond Tart     RM2.80" 
							 + "\nT03    Blueberry Cheese Tart     RM3.10");
			
			System.out.print("\nEnter the product code to check the ingredients : ");
			itemCo = s.next();
			System.out.println("Code : " + itemCo);
			
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
			System.out.println("Products provided in category CAKE" 
							 + "\nCode   Name                            Price");
			System.out.println("C01    Hokkaido Triple Cheese Cake     RM14.90" 
								+ "\nC02    Moist Chocolate Cake            RM11.90" 
								+ "\nC03    Matcha Ice Cream Cake           RM18.90");	
			
			System.out.print("\nEnter the product code to check the ingredients : ");
			itemCo = s.next();
			System.out.println("Code : " + itemCo);
			
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
	
	public void setItemCategory (String itemCat) {
		this.itemCategory = itemCat;
	}
	
	public String getItemCategory() {
		return this.itemCategory;
	}
	
	public void setItemCode (String itemCo) {
		this.itemCode = itemCo;
	}
	
	public String getItemCode() {
		return this.itemCode;
	}
	
	public void bunInfo() {
		if(this.itemCode == "B01" || this.itemCode == "b01") {
			System.out.println("\n- Mexican Coffe Bun -");
			System.out.println("Mexican Coffe Bun is a sweet bun with coffee topping and butter filling. "
								+ "\nIngredients : Flour, Sugar, Milk powder, Butter, Eggs, Instant Coffee, Coffee Essence"
								+ "\nCalories : 580cal per serving");
		}
		
		else if (this.itemCode == "B02" || this.itemCode == "b02") {
			System.out.println("\n- Ham and Cheese Bunn -");
			System.out.println("Ham and Cheese Bun is a sweet bun with small pieces ham filling, grated cheddar cheese and mayonnaise topping."
								+ "\nIngredients : Flour, Milk powder, Sugar, Salt, Eggs, Butter, Ham, Grated cheddar cheese, Mayonnaise"
								+ "\nCalories : 442cal per serving");
		}
		
		else if (this.itemCode == "B03" || this.itemCode == "b03") {
			System.out.println("\n- Red Bean Bun -");
			System.out.println("Red Bean Bun are sweet buns wrapped with red bean paste."
					+ "\nIngredients : Flour, Milk powder, Sugar, Salt, Eggs, Butter, Red bean, Sesame seeds"
					+ "\nCalories : 283cal per serving");
		}
	}
	
	public void tartInfo() {
		if(this.itemCode == "T01" || this.itemCode == "t01") {
			System.out.println("\n- Portuguese Egg Tart -");
			System.out.println("Crispy, flaky crust holding a creamy custard center, blisters on top from the high heat of an oven"
					+ "\nIngredients : Flour, Butter, Salt, Sugar, Milk, Eggs, Whipping cream, Vanilla extract"
					+ "\nCalories : 292cal per serving");
		}
		
		else if (this.itemCode == "T02" || this.itemCode == "t02") {
			System.out.println("\n- Chocolate Almond Tart -");
			System.out.println("Coat crunchy toasted almond flakes in a thick base of cooking chocolate and lay them in a buttery tart shell."
					+ "\nIngredients : Toasted almonds, Butter, Eggs, Sugar, Flour, Chocolate, Heavy cream, Salt, Sliced almonds"
					+ "\nCalories : 220cal per serving");
		}
		
		else if (this.itemCode == "T03" || this.itemCode == "t03") {
			System.out.println("\n- Blueberry Cheese Tart -");
			System.out.println("A rich and creamy cheesecake filling in a buttery shortcrust tart topped with blueberry filling."
					+ "\nIngredients : Butter, Sugar, Eggs, Flour, Cream cheese, Lemon juice, Blueberries filling"
					+ "\nCalories : 275cal per serving");
		}
	}
	
	public void cakeInfo() {
		if(this.itemCode == "C01" || this.itemCode == "c01") {
			System.out.println("\n- Hokkaido Triple Cheese Cake -");
			System.out.println("Light, fluffy and moist, a truly magical combination of 3 types of premium cheese that melts in your mouth and is bursting with flavour."
					+ "\nIngredients : Flour, Sugar, Eggs, Cream cheese, Whipping cream"
					+ "\nCalories : 230cal per seving");
		}
		
		else if (this.itemCode == "C02" || this.itemCode == "c02") {
			System.out.println("\n- Moist Chocolate Cake -");
			System.out.println("Fluffy and moist chocolate cake with a smooth mocha / coffee filling centre, finished with melted semi-sweet chocolate."
					+ "\nIngredients : Flour, Sugar, Cocoa powder, Salt, Eggs, Buttermilk, Butter, Vanilla extract, Coffee"
					+ "\nCalories : 340cal per serving");
		}
		
		else if (this.itemCode == "C03" || this.itemCode == "c03") {
			System.out.println("\n- Matcha Ice Cream Cake -");
			System.out.println("Lotus Biscuit base and chocolate crumbles. Creamy matcha ice cream with chocolate cake in the middle."
					+ "\nIngredients : Matcha, egg, milk, cream, sugar, chocolate cake, lotus biscuit, butter"
					+ "\nCalories : 250cal per serving");
		}
	}
}

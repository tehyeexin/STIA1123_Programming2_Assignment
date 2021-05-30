package Assignment_1;

public class Bakery {
	
	String storeName;
	int yearEstablished;
	
	public Bakery() {
		this.storeName = " ";
	}
	
	public Bakery(String sName) {
		this.storeName = sName;
	}
	
	public Bakery(String sName, int year) {
		this.storeName = sName;
		this.yearEstablished = year;
	}
	
	public void setStoreName (String sName) {
		this.storeName = sName;
	}
	
	public String getStoreName() {
		return this.storeName;
	}
	
	public void setYearEstablished (int year) {
		this.yearEstablished = year;
	}
	
	public int getYearEstablished() {
		return this.yearEstablished;
	}
	
	public void bakeryInfo() {
		System.out.println("Welcome to " + this.storeName + "\nEstablished in " + this.yearEstablished);
	}
	
	

}

/*
 * Jannie Sanchez
 * Assignment #6
 * Instructor: Sergio Pisano
 * Date: March 25, 2020
 */
public class RetailItem {  //set to public so Driver class can access
// Declare variables
	private String description;
	private int unitsOnHand;
	private double price;
	int totalItemsToPurchase;
	double totalCost;
	int newUnits;
	
	public RetailItem(String description, int unitsOnHand, double price){  //Constructor with multiple initialization parameters
		
		this.setDescription(description);
		this.setUnitsOnHand(unitsOnHand);
		this.setPrice(price);
	}  //setting fields and renaming to prevent shadowing
public void setDescription(String d) {
	this.description =d; }

public void setUnitsOnHand(int u) {
	this.unitsOnHand =u; }

public void setPrice(double p) {
	this.price =p; }

public String getDescription() {
	return description; }

public int getUnitsOnHand() {
	return unitsOnHand; }
	
public double getPrice() {
	return price; }


public void purchaseItems (int totalItemsToPurchase) {  //Method to simulate item purchases based on user inputs
		if (unitsOnHand < totalItemsToPurchase) { //To determine if there are enough items in inventory
			 System.out.println("Not enough items in inventory."); }  
		else {
			 newUnits = this.unitsOnHand - totalItemsToPurchase; // to determine accurate number of units
			totalCost = totalItemsToPurchase*this.price; //Calculate price based on units
		System.out.printf("Your purchase price is $ %.2f\n", totalCost); 
			setUnitsOnHand(newUnits);} // sets the number of units left after purchase
	

}
}

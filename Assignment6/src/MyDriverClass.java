 import java.util.Scanner;
/*
 * Jannie Sanchez
 * Assignment #6
 * Instructor: Sergio Pisano
 * Date: March 25, 2020
 */

public class MyDriverClass {
public static void main(String[] args){	

// stored information for RetailItem objects
	RetailItem item1 = new RetailItem("jacket", 12, 59.95);
	RetailItem item2 = new RetailItem("shoes", 40, 34.95);
	RetailItem item3 = new RetailItem("pants", 20, 24.95);
		
	Scanner in = new Scanner(System.in);  // Scanner for user inputs  	  
	String input;  //Declaring variables
	String reply;
	int totalItemsToPurchase;
	boolean continuePurchase = true;  // loop in order to put in multiple item requests
	//To display initial value of items
	System.out.println("Item 1: " + item1.getDescription());
	System.out.println("Units: " + item1.getUnitsOnHand());
	System.out.println("Price: " + item1.getPrice());
	System.out.println("");
	
	System.out.println("Item 2: " + item2.getDescription());
	System.out.println("Units: " + item2.getUnitsOnHand());
	System.out.println("Price: " + item2.getPrice());
	System.out.println("");
	
	System.out.println("Item 3: " + item3.getDescription());
	System.out.println("Units: " + item3.getUnitsOnHand());
	System.out.println("Price: " + item3.getPrice());
	System.out.println();

while (continuePurchase) { //Create loop 
System.out.print(" Enter item you wish to purchase: "); 
    input = in.next();
   
System.out.print(" Enter total items to purchase: ");
	totalItemsToPurchase = in.nextInt();
 
   	if(input.equalsIgnoreCase("jacket")) {  //takes inputs to calculate price
   		 item1.purchaseItems(totalItemsToPurchase); }
   	
   		else if (input.equalsIgnoreCase("shoes")) {
   		item2.purchaseItems(totalItemsToPurchase); }
   	   		
   		else if (input.equalsIgnoreCase("pants")) {
   		item3.purchaseItems(totalItemsToPurchase); }
   	
   		else {
   		 System.out.println("ERROR. No item found."); } //if another item is typed in other than the three listed
   	
  System.out.println("Would you like to purchase another item: ");
  	reply = in.next();
  	in.nextLine();
  	if(reply.equalsIgnoreCase("Yes")){
  		System.out.println();
  		continuePurchase = true; }
  	else {
  		System.out.println ("Thank you and have a nice day.");
  		continuePurchase = false; } //to close loop
   
  
   }
   
   in.close();	 // close scanner
   }
} 

/* Returns:
 * Item 1: jacket
Units: 12
Price: 59.95

Item 2: shoes
Units: 40
Price: 34.95

Item 3: pants
Units: 20
Price: 24.95

 Enter item you wish to purchase: jacket
 Enter total items to purchase: 10
Your purchase price is $ 599.50
Would you like to purchase another item: 
yes

 Enter item you wish to purchase: shoes
 Enter total items to purchase: 20
Your purchase price is $ 699.00
Would you like to purchase another item: 
yes

 Enter item you wish to purchase: pants
 Enter total items to purchase: 5
Your purchase price is $ 124.75
Would you like to purchase another item: 
yes

 Enter item you wish to purchase: jacket
 Enter total items to purchase: 5
Not enough items in inventory.
Would you like to purchase another item: 
yes

 Enter item you wish to purchase: shoes
 Enter total items to purchase: 10
Your purchase price is $ 349.50
Would you like to purchase another item: 
yes

 Enter item you wish to purchase: pants
 Enter total items to purchase: 3
Your purchase price is $ 74.85
Would you like to purchase another item: 
no
Thank you and have a nice day.

 * 
 * 
 */


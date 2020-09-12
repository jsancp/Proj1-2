import java.util.Scanner;

/*
 * Author: Jannie Sanchez
 * Course: COP 2210 RVD
 * Date: February 20, 2020
 * Assignment 4
 * Instructor: Sergio Pisano
 */

public class Assignment4 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	//Declaring variables
	String ticket;
	String state;
	int age;
	double basePrice = 100;
	double seniorPrice= 50; //Senior citizen discount %50 off base price
	double ticketPrice;
	
	System.out.println("Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N");
	ticket=in.next();	//Starts program, purpose is to purchase an admission ticket
	if(ticket.equalsIgnoreCase("N"))
		System.exit(0); // Closes program if user does not want to purchase a ticket

	while(ticket.equalsIgnoreCase("Y")) { //Create loop 
		
		System.out.println("Enter age: ");
		age=in.nextInt();
		in.nextLine(); //Ensures the entire line is read, including spaces
		if(age<=0) {
			//Output error if age input is <=0, since it is not a valid age
				System.out.print("ERROR: Age must be greater than 0. Please try again.");
				System.exit(0);
			}	
		else if (age <= 3) {
			ticketPrice=basePrice-100; //Free admission is user is under 4 years of age
			System.out.printf("Your ticket price is $ %.2f\n", ticketPrice);
			System.exit(0);
			}
		else if(age>=4) {  
			System.out.println("Enter your state of residence: ");
			state=in.nextLine();
			//Run nested if-else statements, that express the different discounts, within this statement if age is greater than 4
			if((age<=13)&&(state.equalsIgnoreCase("Georgia"))) { 
				ticketPrice =basePrice-(basePrice*0.18);
			} //Discount for users younger than 14 who are Georgia residents
			else if((age>=65)&&(state.equalsIgnoreCase("Texas"))) {
				ticketPrice=seniorPrice-(seniorPrice*.075);
			}  //Added discount for seniors that are Texas residents
			else if(age>=65) { 
			     ticketPrice= seniorPrice;	
			}  //Discount for all senior citizens (65 years or older)
			else if(state.equalsIgnoreCase("Florida")) { 
					ticketPrice=basePrice-20;
			} //Discount for all Florida residents (senior citizen discounts over ride this discount)
			else {
				ticketPrice=basePrice;
			} //Print total cost of ticket price after calculating discounts
			System.out.printf("Your ticket price is $ %.2f\n", ticketPrice);
		}
				
	break;// End loop
			}
	
in.close();//close scanner
		}
		
	}
	
/* Test Results:

Run #1
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
45
Enter your state of residence: 
New York
Your ticket price is $ 100.00


Run #2
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
70
Enter your state of residence: 
New York
Your ticket price is $ 50.00


Run #3
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
3
Your ticket price is $ 0.00


Run #4
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
13
Enter your state of residence: 
Georgia
Your ticket price is $ 82.00


Run #5
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
69
Enter your state of residence: 
Texas
Your ticket price is $ 46.25


Run #6
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
-10
ERROR: Age must be greater than 0. Please try again.

Run #7
Welcome to Kings' Island. Would you like to purchase a ticket?: Y/N
Y
Enter age: 
30
Enter your state of residence: 
Georgia
Your ticket price is $ 100.00

 */

		
		

	
		





/*
 * Author: Jannie Sanchez
 * Course: COP 2210 RVD
 * Date: February 10, 2020
 * Assignment # 3a
 * Instructor: Sergio Pisano
 */

import java.util.Scanner;


public class Assignment3a { //Had to change to Assignment3a.java to run program
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String city1, city2;  //variables for the cities that will be input to determine result
	int distance; // distance input will need to be an integer
	double costPerMile; //the output will be calculated as a decimal
	int dollarAmount; //result will be an integer
System.out.print("Enter the starting city: ");
city1=in.next(); // Input the name of the first city
System.out.print("Enter the ending city: ");
city2=in.next(); // Input the name of the second city
System.out.print("Enter distance in miles between cities: ");
distance=in.nextInt(); //Input the number of miles between both cities as integer
System.out.print("Enter the cost of travel per mile: "); 
costPerMile=in.nextDouble(); //Input of the cost per mile as decimal
dollarAmount=(int)(distance*costPerMile);  // Calculate the dollar amount for the distance input multiplied by the cost per mile input
System.out.println("\n\nThe cost of traveling from" + city1 + " to" + city2 + "is $" + dollarAmount); 
//Will display the name of each city and place a $ in front of the dollar amount that will calculated
in.close(); //Closing the Scanner to avoid memory leaks
}
}

/*
 * OutPut Results:
 * Enter the starting city: Cincinnati
 * Enter distance in miles between cities: 115
 * Enter the cost of travel per mile: .065
 * The cost of traveling fromCincinnati toColumbusis $7
 */


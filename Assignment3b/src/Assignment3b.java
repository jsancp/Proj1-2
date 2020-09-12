import java.util.Scanner; //Has to placed at the top of the program. Needed to import Scanner package from Java library

/*
 * Author: Jannie Sanchez
 * Course: COP 2210 RVD
 * Date: February 10, 2020
 * Assignment # 3b
 * Instructor: Sergio Pisano
 */


public class Assignment3b {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in); //Use Scanner to obtain input
	String name; // Will begin listing variables
	double pricePerGallon; // The price per gallon of gasoline paid for at the time of the last fill up as double cast for actual value
	double fillUpCost; // The total amount paid for the fill up as double cast for actual value
	int initialOdometer; //Starting odometer value
	int finalOdometer; //Ending odometer value
	int totalMiles; //The value of the total miles driven based off of the two odometer values
	double gallonsUsed; // The number of gallons of gasoline used as double cast for actual value
	double milesPerGallon; //Miles per gallon that the car achieved 
	System.out.print("Enter name: "); 
	name=in.next(); //The name input by the user
	System.out.print("Enter price per gallon: ");
	pricePerGallon=in.nextDouble(); //Price per gallon of gasoline paid that is input by the user
	System.out.print("Enter total price for fill up: ");
	fillUpCost=in.nextDouble(); //Total price paid for the gasoline that is input by the user
	System.out.print("Enter initial odometer value: ");
	initialOdometer=in.nextInt(); //Starting odometer value input by the user
	System.out.print("Enter final odometer value: ");
	finalOdometer=in.nextInt(); //Ending odometer value input by the user
	totalMiles=(int)(finalOdometer-initialOdometer); //The difference of the ending odometer value and the starting odometer value
	gallonsUsed=(double)(fillUpCost/pricePerGallon);  //The fillUpCost value input by the user divided by the pricePerGallon value input by the user
	milesPerGallon=(double)(totalMiles/gallonsUsed); //The totalMiles value calculated previously will be divided by the gallonsUsed value that was also calculated previously
	System.out.printf("\n\n" + name + " you drove " + totalMiles + " miles using " + (int) gallonsUsed + " gallons with an mpg of %.2f\n", milesPerGallon);
	in.close(); //used the %f format specifier before the milesPerGallon to print that value with only two digits appearing after the decimal point. Placed "(int)" before the "gallonsUsed" value to display it as an integer instead of a decimal 
	}
}


/*
OUTPUT:
 
Test 1
Enter name: Jannie
Enter price per gallon: 2.84
Enter total price for fill up: 20.25
Enter initial odometer value: 6144
Enter final odometer value: 6279


Jannie you drove 135 miles using 7 gallons with an mpg of 18.93

Test 2
Enter name: Frank
Enter price per gallon: 1.72
Enter total price for fill up: 31.40
Enter initial odometer value: 21975
Enter final odometer value: 22496


Frank you drove 521 miles using 18 gallons with an mpg of 28.54


Test 3
Enter name: Ruth
Enter price per gallon: 3.75
Enter total price for fill up: 22.87
Enter initial odometer value: 89108
Enter final odometer value: 89183


Ruth you drove 75 miles using 6 gallons with an mpg of 12.30


Test 4
Enter name: Gail
Enter price per gallon: 2.05
Enter total price for fill up: 20.50
Enter initial odometer value: 65380
Enter final odometer value: 65691


Gail you drove 311 miles using 10 gallons with an mpg of 31.10

 */




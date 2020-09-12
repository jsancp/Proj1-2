import java.util.Scanner; //Needed for Scanner
import java.io.*; //Needed for File and IO exception
import java.time.LocalDate;
import java.time.LocalTime;
/*
* Jannie Sanchez
* Assignment #7
* Instructor: Sergio Pisano
* Date: April 6, 2020
*/

public class CoinDriver {
public static void main(String[] args)	throws IOException {
	
//Declare variables
String input;	
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();

Scanner in = new Scanner(System.in); //create scanner object for keyboard input	
{
System.out.print("Do you need to display the past run? "); 
	input = in.nextLine();
	if (input.equalsIgnoreCase("yes")) {
			Coin newCoin= new Coin();
			newCoin.showPastRun(); }  // Calling showPastRun method
			
		PrintWriter outputFile = new PrintWriter("myoutput.txt"); //creates text file
		outputFile.println("Program output on " + date + " at " + time); //Will add the current date and time for each run to the text file
	
		System.out.println("\n\nNew Coin-Toss Simulator Run: ");
		Coin flip = new Coin();	
		int numberOfHeads = 0;
		int numberOfTails = 0;
		int totalNumOfTosses = 20;
			System.out.println("Initial side facing up is " + flip.getSideUp() + ".");//Display an initial side of coin
			outputFile.println("Initial side facing up is " + flip.getSideUp() + "."); // Saving printed line to text file
			for(int newToss = 1; newToss <= totalNumOfTosses; newToss++ ) { //For loop to run toss method a certain number of times
				flip.toss();
				//Will track number of times each side is shown
				if(flip.getSideUp() == "heads" ) {
					numberOfHeads = numberOfHeads + 1; }
				else {
					numberOfTails = numberOfTails + 1; }
				System.out.println("Toss " + newToss + ": " + flip.getSideUp()); 
				outputFile.println("Toss " + newToss + ": " + flip.getSideUp()); } // Saving printed line to text file
			
		System.out.println("\nNumber of times toss resulted in heads: " + numberOfHeads);
		outputFile.println("\nNumber of times toss resulted in heads: " + numberOfHeads); // Saving printed line to text file
		System.out.println("Number of times toss resulted in tails: " + numberOfTails);
		outputFile.println("Number of times toss resulted in tails: " + numberOfTails); // Saving printed line to text file
		outputFile.close(); 
	
}				
in.close();	// close scanner
	
}
}

/* Output when previous run is requested:
 * 
Do you need to display the past run? yes
****Previous Coin Toss Run*****
Program output on 2020-04-05 at 12:14:01.334681
Initial side facing up is tails.
Toss 1: heads
Toss 2: heads
Toss 3: tails
Toss 4: tails
Toss 5: tails
Toss 6: heads
Toss 7: tails
Toss 8: tails
Toss 9: heads
Toss 10: heads
Toss 11: heads
Toss 12: tails
Toss 13: heads
Toss 14: tails
Toss 15: heads
Toss 16: tails
Toss 17: tails
Toss 18: heads
Toss 19: tails
Toss 20: heads

Number of times toss resulted in heads: 10
Number of times toss resulted in tails: 10


New Coin-Toss Simulator Run: 
Initial side facing up is tails.
Toss 1: heads
Toss 2: heads
Toss 3: tails
Toss 4: tails
Toss 5: heads
Toss 6: heads
Toss 7: heads
Toss 8: heads
Toss 9: tails
Toss 10: heads
Toss 11: heads
Toss 12: tails
Toss 13: tails
Toss 14: tails
Toss 15: heads
Toss 16: heads
Toss 17: heads
Toss 18: tails
Toss 19: tails
Toss 20: tails

Number of times toss resulted in heads: 11
Number of times toss resulted in tails: 9



*Output when previous run is NOT requested:

Do you need to display the past run? No


New Coin-Toss Simulator Run: 
Initial side facing up is heads.
Toss 1: heads
Toss 2: heads
Toss 3: heads
Toss 4: heads
Toss 5: tails
Toss 6: tails
Toss 7: tails
Toss 8: tails
Toss 9: tails
Toss 10: tails
Toss 11: tails
Toss 12: heads
Toss 13: heads
Toss 14: heads
Toss 15: tails
Toss 16: heads
Toss 17: heads
Toss 18: heads
Toss 19: heads
Toss 20: heads

Number of times toss resulted in heads: 12
Number of times toss resulted in tails: 8
 */

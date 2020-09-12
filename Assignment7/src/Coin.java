import java.io.*; //Needed for PrintWriter 
import java.util.Random; // import random that will be used to determine the side of the coin
import java.util.Scanner; //Needed for the Scanner
/*
 * Jannie Sanchez
 * Assignment #6
 * Instructor: Sergio Pisano
 * Date: April 6, 2020
 */
public class Coin {

	private String sideUp; //so that it can not be changed outside of this class
	
	public void toss() {
		Random random = new Random();
		int tossResult;
		tossResult = random.nextInt (2);	//Will generate random integer from 0-1
		if (tossResult == 0) {
			sideUp ="heads"; }
		else {
			sideUp ="tails"; }
	}
	
	public String getSideUp() {
		return sideUp; }
	
	public Coin() {  // No-argument constructor to call toss method
		toss(); }
	
	public void showPastRun ()  throws IOException { //Open text file
		File file = new File("myoutput.txt");
		Scanner inputFile = new Scanner(file);
		System.out.println("****Previous Coin Toss Run*****");  // Use to indicate dispalyed run is the previous run
		while (inputFile.hasNext()) {  //Will read each line from the file
			String str = inputFile.nextLine();
			System.out.println(str); }
		
		inputFile.close(); } //Close the file
		
}
		
		


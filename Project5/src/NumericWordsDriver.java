import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**Author: Jannie Sanchez
Date: 7/26/20
Version: Eclipse Version 5
Desc: Driver class to run the NumericWords program. Contains Array list for the keypad numbers.
**/
public class NumericWordsDriver {
	
	
	public static void main(String[] args)  {
		
	//List view of Arraylist used to store all letter options for each number of keypad.
		List<List<Character>> letters = Arrays.asList(
				
			 	Arrays.asList('0'),
			 	Arrays.asList('1'),
			 	Arrays.asList('A', 'B', 'C'),
			 	Arrays.asList('D', 'E', 'F'),
			 	Arrays.asList('G', 'H', 'I'),
			 	Arrays.asList('J', 'K', 'L'),
			 	Arrays.asList('M', 'N', 'O'),
			 	Arrays.asList('P', 'Q', 'R', 'S'),
			 	Arrays.asList('T', 'U', 'V'), 
			 	Arrays.asList('W', 'X', 'Y', 'Z'));
	 
	//Variables
	String numbers;	
	int digit;
	
	//Array to store number inputs from user
	int [] nums = new int [5]; 
	
	//Scanner to user input
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter a combination of 5 numbers:");
	numbers= in.nextLine();
	
	//Loop for reading each digit input from user
	for(int i = 0; i < numbers.length(); i++) {
		//read each digit input as character
		char ch = numbers.charAt(i);
		//Convert string to int to store in array list
		digit = Integer.parseInt(String.valueOf(ch));
		 nums [i]= digit;
		
	} 
	
	//Calling and setting method from object class
	NumericWords.lettersOutput(letters, nums, " ", nums.length-1);   
	
			//Close scanner
			in.close();
	}

	
}

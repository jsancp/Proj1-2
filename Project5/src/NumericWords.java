import java.util.ArrayList;
import java.util.List;
/**Author: Jannie Sanchez
Date: 7/26/20
Version: Eclipse Version 5
Desc: Object class that contains the recursion method 
**/
public class NumericWords {  
	//Recursion method that takes input from main class and runs it to obtain all results
	public static void lettersOutput(List<List<Character>> letters, int[] nums, 
			String result, int index) {
		
		//Print result if all numbers input are checked
			if(index == -1) {
			System.out.println(result + " ");
			return;
			
		}
		
			int number = nums [index];
		
		
		
	//Loop to replace each number with each corresponding letter option
	for(char c : letters.get(number)) {
		lettersOutput(letters, nums, c + result, index-1);
	}
	}
	}
	
	
		 
	
		








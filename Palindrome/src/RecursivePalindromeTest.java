/**
 * This main method uses the palindromeF helper method which includes the palindrome method
 * in order to determine whether or not a user entered String is a palindrome.
 * 
 * 
 * @author AG
 * @version 11/02/2007
 *
 *  Modified by: AMR
 * Date: 06/18/09
 */

import java.util.Scanner;
public class RecursivePalindromeTest {
	 public static void main(String[] args)
	    {
	        String word;
	        boolean testPalindrome;
	        Scanner in = new Scanner(System.in);
	        RecursivePalindrome test = new RecursivePalindrome();
	        
	        System.out.println("Please enter your word(Enter q to quit)");
	        word = in.nextLine();
	        while(word.compareToIgnoreCase("q") != 0)
	        {
	             testPalindrome = test.isPalindrome(word);
	             test.printPalindrome(word, testPalindrome);
	             System.out.println("Please enter your word(Enter q to quit)");
	             word = in.nextLine();
	        }
	        System.out.println("You have quit the program");
	    in.close();
	    }
}

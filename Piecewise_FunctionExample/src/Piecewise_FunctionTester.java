/**
 * class Piecewise Function Tester
 * 
 *
 * @author Dr. Walker
 * @version 1
 * description: Recursive piecewise function example
 */
 import java.util.Scanner;
public class Piecewise_FunctionTester {
	 public static void main(String [] args)
	    {
	      Scanner in = new Scanner(System.in);
	      int x;
	      
	      System.out.println("Please enter a value: ");
	      x = in.nextInt();
	      System.out.println("The result of F(" + x + ") is " + Piecewise_Function.function(x));
	   in.close(); 
	    }

}

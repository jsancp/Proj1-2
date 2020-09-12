/**
 * class Piecewise Function
 * 
 *
 * @author Dr. Walker
 * @version 1
 * description: Recursive piecewise function example
 */
 
public class Piecewise_Function {
	public static int function(int x)
    {
     if(x <= 10)
     {
        System.out.println(x + " <= 10, therefore f(" + x + ") = -5");
        return -5;
     }
     else
     {
        System.out.println(x + " > 10, therefore f(" + x + ") = f(" + x + " -3) + 2 = f(" + (x-3) + ") + 2");
        return function(x-3) + 2;
     }
     
  }

}

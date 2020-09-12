/**
 * Get three sides of an equilateral triangle.
 * 
 * C W.
 * 2/2/19
 */
public class Equilateral extends Triangle
{
	 public Equilateral(double a)
	    {
	        super(a, a, a);
	    }
	    
	    public String toString()
	    {
	         return "The equilateral triangle has a side a of " + getSideA() + " a side b of " + getSideB() + " and a side c of " + getSideC();
	    }

}

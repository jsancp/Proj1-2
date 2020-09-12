/**
 * Get three sides of an isosceles right triangle.
 *
 * C W.
 * 2/2/19
 */

public class IsoscelesRight extends Triangle
{
	 public IsoscelesRight(double a)
	    {
	        super(a, a, a * Math.sqrt(2));
	    }
	    
	    public String toString()
	    {
	         return "The isosceles right triangle has a side a of " + getSideA() + " a side b of " + getSideB() + " and a side c of " + getSideC();
	    }
}

/**
 * Get three sides of a triangle.
 * 
* C W.
 * Mar. 21st
 */

public class Triangle {
	 private double sa, sb, sc;
	    public Triangle(double a, double b, double c)
	    {
	        sa = a;
	        sb = b;
	        sc = c;
	    }
	    
	    public double getSideA()
	    {
	        return sa;
	    }
	    
	    public double getSideB()
	    {
	        return sb;
	    }
	    
	    public double getSideC()
	    {
	        return sc;
	    }
	    
	    public String toString()
	    {
	         return "The base triangle has a side a of " + sa + " a side b of " + sb + "and a side c of " + sc;
	    }
	   
	    public String genMessage()
	    {
	        return "The base triangle has a side a of " + sa + " a side b of " + sb + " and a side c of " + sc;
	    } 
}

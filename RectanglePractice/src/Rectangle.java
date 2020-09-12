/**
 * Rectangle Demo.
 * 
 * C. Walker
 * 2/2/19
 */
public class Rectangle {
	// instance variables 

	private int length, width;
		/**
		 * Constructor for objects of class Rectangle
		 */
		public Rectangle(int l, int w) {
			
			length = l;
			width = w;
		}


		// return the height
		public int getLength()
		{
			return length;
		}

	   // return the width
		public int getWidth()
		{
			return width;
		}
	 
	   // calculate the area - length times width  
	   public int calcArea()
	   {
		   return length * width;
	   }
	   
	   // print a message stating the length and width of the rectangle
	   public String toString()
	   {
		   return "The rectangle has a length of " + length + " and a width of " + width + ".";
	   }
	   
	   // print a generic message that does not refer specifically to a rectangle so that it can be reused
	   public String genMessage()
	   {
		   return "The shape has a length of " + length + " and a width of " + width + ".";
	   }

	   // print a generic message that does not refer specifically to a rectangle so that it can be reused and overridden	   
	   public String genMessage2()
	   {
		   return "The shape has a length of " + length + " and a width of " + width + ".";
	   } 
}

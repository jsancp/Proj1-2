
public class Box extends Rectangle
{
  private int height;  //instance variable
  
  //Constructor for objects of class box.
  public Box(int l, int w, int h) {
	  
	  	super(l, w);  //Call Super class
	  	height = h;  //initialize instance variable. BOx requires a height variable not found in super class
  }
  
  public int getHeight() {  //return the height
	  return height;
  }
  
  public int calcArea() {
	  return getLength()* getWidth()* height;
  }
  
  public String toString() {  //Calling toString method from super class and over riding it
	  return "The box has a length of " + getLength() + " a width of " + getWidth() + " and a height of " + getHeight() + ".";
  }
  
  public String genMessage2() {  //Calling genMessage2 method from super class and over riding it
	  return "The shape has a length of " + getLength() + " and a width of " + getWidth() + " and a height of " + getWidth() + ".";
  }
  
}

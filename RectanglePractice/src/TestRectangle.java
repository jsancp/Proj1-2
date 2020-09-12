/**Author: Charlyne Walker
   Date: 2/2/19
   Desc: Tester program for Rectangle, Box and Cube
   **/
public class TestRectangle {
	 public static void main(String [] args)
     {
        //object instances of rectangle, box and cube
		Rectangle rect1 = new Rectangle(6, 8);
		Box box1 = new Box(5, 6, 10);
		Cube cube1 = new Cube(8);
       
		 //print lengths
		System.out.println("The rectangle has a length of " + rect1.getLength());
		System.out.println("The box has a length of " + box1.getLength());
		System.out.println("The cube has a length of " + cube1.getLength());
        
        System.out.println(); //blank line to separate output
        
        //overridden toString output
        System.out.println(rect1);
        System.out.println(box1);
        System.out.println(cube1);
 
        System.out.println(); //blank line to separate output
        
        //generic output inherited from Rectangle using genMessage()
        System.out.println(rect1.genMessage());
        System.out.println(box1.genMessage());
        System.out.println(cube1.genMessage());
        
        System.out.println(); //blank line to separate output
        
        //generic output inherited from Rectangle and Box using genMessage2()
        System.out.println(rect1.genMessage2());
        System.out.println(box1.genMessage2());
        System.out.println(cube1.genMessage2());
        
        System.out.println();
        
        //area output
        System.out.println("The area of the rectangle is " + rect1.calcArea());
        System.out.println("The area of the box is " + box1.calcArea());
        System.out.println("The area of the cube is " + cube1.calcArea());
        
     
     }
}


/**
 * Print out the triangles
 * 
 * C W.
 * 2/2/19
 */
public class TestTriangle {
	 public static void main(String[] args)
	    {
	        Triangle tri = new Triangle(5.9, 8.5, 7.3);
	        Equilateral equ = new Equilateral(4.1);
	        IsoscelesRight iso = new IsoscelesRight(10.2);
	        
	        //print side a of each triangle
	        System.out.println("The base triangle has a side a of " + tri.getSideA());
	        System.out.println("The equilteral triangle has a side a of " + equ.getSideA());
	        System.out.println("The isosceles right triangle has a side a of " + iso.getSideA());
	        
	        System.out.println();
	         
	        //overridden toString output
	        System.out.println(tri);
	        System.out.println(equ);
	        System.out.println(iso);
	         
	        System.out.println();
	         
	        //generic output inherited from triangle
	        System.out.println(tri.genMessage());
	        System.out.println(equ.genMessage());
	        System.out.println(iso.genMessage());
	        
	        System.out.println();
	         
	       
	        //area output
	        //System.out.println("The area of the rectangle is " + rect1.calcArea());
	        //System.out.println("The area of the box  is " + box1.calcArea());
	       // System.out.println("The area of the cube  is " + cube1.calcArea());

	        
	    }
	    

}

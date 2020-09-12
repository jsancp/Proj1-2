import java.util.ArrayList;
public class SeatingChartRunner {

	 public static void main(String[] args) 
	    {
	    	//Add a 2D array of type Student with 10 students. A student will have a name and number of absences.
	    	
	     
		 Student [][] stuList = { {new Student("Karen",3), new Student ("Liz", 1), new Student("Paul", 4)}, 
				 {new Student("Lester", 1), new Student("Henry",5), new Student("Renee", 9)},
				 {new Student("Glen",2), new Student("Fran",6), new Student("David", 1)}, 
				 {new Student("Danny",3), null, null} };
	      
	      //An object of type SeatingChart is needed 
	      
	      System.out.println("Original Seating Chart");
	      	SeatingChart1 kids = new SeatingChart1(stuList, 3, 4);
	      	System.out.println( kids);
	      	
	    	//Write the code to output the original seating chart
	    	/*example output

			Karen 3  Lester 1 Glen 2   Danny 3
			Liz 1    Henry 5  Fran 6   null
			Paul 4   Renee 9  David 1  null
		
			*/
			
	      	System.out.println("Seating Chart with Absent Students Removed");
	      	kids.removeAbsentStudents(4);
	      	System.out.println(kids);
	      	
			//Outputs the updated seating chart with the students with too many absenses removed	
			/*example output
			Karen 3  Lester 1 Glen 2   Danny 3
			Liz 1    null     null     null
			Paul 4   null     David 1  null

			*/

			
	    }
}

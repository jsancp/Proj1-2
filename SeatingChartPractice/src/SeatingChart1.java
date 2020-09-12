
import java.util.List;
public class SeatingChart1 {

	private Student[][] seats;
	   private int rows;
	   private int cols;
		
		public SeatingChart1( Student [][] studentList, int inRows, int inCols) 
		{ 
	    	seats = studentList;
	    	rows = inRows;
	    	cols = inCols;
	    	//initialize instance variables	
		}  
		// method to update the seating chart
		public void removeAbsentStudents( int allowedAbsences )
		{
			for(int row= 0; row < seats.length; row++) {
				for(int col = 0; col < seats[0].length; col++) {
				
					if(seats[row][col] == null) {
						}
					else {
						if(seats[row][col].getAbsentCount() > allowedAbsences)
							seats[row][col] = null;
					}
				}
			}
		}   
	    	
	   public String toString()
	    {
	    //Column major order
	    	String ret = "";
	    	for(int col = 0; col < seats[0].length; col++)
	    	{
	    		for(int row = 0; row < seats.length; row++)
	    		{
	    			if( seats[row][col] == null )
	    				ret += String.format("%-9s","null");
	    			else
	    				ret += seats[row][col];
	    		}
	    		ret += "\n";
	    	}
	    	return ret;

	    }
}

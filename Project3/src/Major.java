/**Author: Jannie Sanchez
   Date: 7/11/20
   Version: Eclipse Version 5
   Desc: Super class that will be the base for numerous sub classes
   **/
public class Major {
	
	 //Instance variables
	private String majorName;
	private int credits;
	private double minGPA;
	
	//Constructor for objects in Major class
	public Major(String name, int creditsReq, double GPA) {
		
		majorName = name;
		credits = creditsReq;
		minGPA = GPA;
	}
	// Return Major Name
	public String getMajorName() {
		return majorName;
	}
	//Return number of prerequisite classes
	public int getCreditsReq() {
		return credits;
	}
	//Return minimum GPA
	public double getMinGPA() {
		return minGPA;
	}
	//Print statement including the major name, number of credits required and the minimum GPA required
	public String toString() {
		return "Any " + majorName + " will require at least " + credits + " credits and a minumum GPA of "  + minGPA 
				+ " in order to complete the degree program." ;
	}

}

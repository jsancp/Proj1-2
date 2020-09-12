/**Author: Jannie Sanchez
   Date: 7/11/20
   Version: Eclipse Version 5
   Desc: Biology sub class for Major super class
   **/
public class Biology extends Major   //sub class extending from the Major base class
{
	//Unique instance variables for this class
	private int labHours;
	private int numLabReports;
	
	//Constructor for the objects in the Biology class
	public Biology(String name, int creditsReq, double GPA, int reqLabHours, int labReports) {
		
		super(name, creditsReq, GPA);  //variables from the base class
		labHours = reqLabHours;
		numLabReports = labReports;
	}
	
	//Method to return number of required lab hours
	public int getLabHours() {
		return labHours;
	//Method to return number of required lab reports
	}
	public int getLabReports( ) {
		return numLabReports;
	}
	//Calling toString method from super class and over riding it
	public String toString() {
		return "The " + getMajorName() + " requires " + getCreditsReq() + " credits and a minumum GPA of "  + getMinGPA()
				+ " and " + getLabHours() + " lab hours and " + getLabReports() + " lab reports submitted in order to complete the degree program." ;
	}
}

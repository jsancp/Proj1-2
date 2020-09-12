/**Author: Jannie Sanchez
   Date: 7/11/20
   Version: Eclipse Version 5
   Desc: English sub class for Major super class
   **/
public class English extends Major   //sub class extending from the Major base class
{
//Additional instance variable for English class
	private int classes;  //Number of prerequisite classes required for the English Major
	private int writingCreditHours; //Number of credit hours required in writing courses for the English Major
	
	//Constructor for the objects in the English class
	public English(String name, int creditsReq, double GPA, int prereqisiteClasses, int writingHours) {
		super(name, creditsReq, GPA);  //variables from the base class
		classes = prereqisiteClasses;
		writingCreditHours = writingHours;
	}
	//Method to return number of prerequisite classes
	public int getClasses() {
		return classes;
	}
	//Method to return number of credit hours in writing courses
	public int getWritingCreditHours() {
		return writingCreditHours;
	}
	//Calling toString method from super class and over riding it
	public String toString() {
		return "The " + getMajorName() + " requires " + getCreditsReq() + " credits and a minumum GPA of "  + getMinGPA() 
				+ " and " + getClasses() + " prerequisite classes and " + getWritingCreditHours() + " credit hours in writing courses in order to complete the degree program.";
	}
}

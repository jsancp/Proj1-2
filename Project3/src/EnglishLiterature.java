/**Author: Jannie Sanchez
   Date: 7/11/20
   Version: Eclipse Version 5
   Desc: English Literature sub class for English base class which has Major as a super class
   **/
public class EnglishLiterature extends English  //sub class extending from the English base class
{
	//instance variable unique to class
	private int analysisCourses;
	
	//Constructor for the objects in the English Literature class
	public EnglishLiterature(String name, int creditsReq, double GPA, int prereqisiteClasses, int writingHours, int litAnalysisCLasses) {
		
		super(name, creditsReq, GPA, prereqisiteClasses, writingHours); //variables from the base class
		analysisCourses = litAnalysisCLasses;
	}
	//return number of literature analysis courses required
	public int getAnalysisCourses() {
		return analysisCourses;
	}
	//Calling toString method from super class and over riding it
	public String toString() {
		return "The " + getMajorName() + " requires " + getCreditsReq() + " credits and a minumum GPA of "  + getMinGPA() 
				+ " and " + getClasses() + " prerequisite classes and " + getWritingCreditHours() + " credit hours in writing courses and " 
				+ getAnalysisCourses() + " literature analysis courses in order to complete the degree program." ;
	}
}

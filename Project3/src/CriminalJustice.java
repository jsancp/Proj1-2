/**Author: Jannie Sanchez
   Date: 7/11/20
   Version: Eclipse Version 5
   Desc: Criminal Justice sub class for Major super class
   **/
public class CriminalJustice extends Major   //sub class extending from the Major base class
{
	//Unique instance variables for this class
		private int internHours;
		private int caseStudies;
		
		//Constructor for the objects in the Criminal Justice class
		public CriminalJustice(String name, int creditsReq, double GPA, int reqInternHours, int caseStudiesReasearched) {
			
			super(name, creditsReq, GPA); //variables from the base class
			internHours = reqInternHours;
			caseStudies = caseStudiesReasearched;
		}
		
		//return required number of intern-ship hours
		public int getInternHours() {
			return internHours;
		}
		
		public int getCaseStudies() {
			return caseStudies;
		}
		//Calling toString method from super class and over riding it
		public String toString() {
			return "The " + getMajorName() + " requires " + getCreditsReq() + " credits and a minumum GPA of "  + getMinGPA()
					+ " and " + getInternHours() + " internship hours and " + getCaseStudies() + " reaserched in order to complete the degree program." ;
		}
}

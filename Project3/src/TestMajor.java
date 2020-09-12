import java.util.ArrayList;  //Imported to create an array list 

/**Author: Jannie Sanchez
   Date: 7/11/20
   Version: Eclipse Version 5
   Desc: Tester program for Major class and subclasses
   **/
public class TestMajor 
{
	 public static void main(String[] args) {
		 
	//Object instances of subclasses
		Major  maj = new Major("Major", 120, 2.0);
		English englsMaj = new English("English major", 130, 2.5, 12, 6);
		Biology bioMaj = new Biology("Biology major", 130, 2.75, 40, 5);
		CriminalJustice cjMaj = new CriminalJustice("Criminal Justice major", 125, 2.0, 25, 2);
		EnglishLiterature elMaj = new EnglishLiterature("English Literature major", 135, 2.8, 14, 12, 4);
	
	//Create array list that contains the major objects
	ArrayList<Object> majorList = new ArrayList();
		majorList.add(maj);
		majorList.add(englsMaj);
		majorList.add(bioMaj);
		majorList.add(cjMaj);
		majorList.add(elMaj);
		
	System.out.println("+++++ AVAILABLE MAJORS LIST +++++");
	System.out.println(); //Create blank line 
	//Print major names
	System.out.println(maj.getMajorName());
	System.out.println(englsMaj.getMajorName());
	System.out.println(bioMaj.getMajorName());
	System.out.println(cjMaj.getMajorName());
	System.out.println(elMaj.getMajorName());
		
	System.out.println(); //Create blank line 
	System.out.println("++++++++++++++++++++++++++++++++++");	
	System.out.println();  //Create blank line to separate outputs
		
	//Print required credits for each major class
	System.out.println("The minimum credits required for any major is " + maj.getCreditsReq() + ".");
	System.out.println("The credits required for the English major is " + englsMaj.getCreditsReq() + ".");
	System.out.println("The credits required for the Biology major is " + bioMaj.getCreditsReq() + ".");
	System.out.println("The credits required for the Criminal Justice major is " + cjMaj.getCreditsReq() + ".");
	System.out.println("The credits required for the English Literature major is " + elMaj.getCreditsReq() + ".");
	
	System.out.println();  //Create blank line to separate outputs

	//Print minimum GPA required for each major class
	System.out.println("The minimum GPA required for any major is " + maj.getMinGPA() + ".");
	System.out.println("The minimum GPA required for the English major is " + englsMaj.getMinGPA() + ".");
	System.out.println("The minimum GPA required for the Biology major is " + bioMaj.getMinGPA() + ".");
	System.out.println("The minimum GPA required for the Criminal Justice major is " + cjMaj.getMinGPA() + ".");
	System.out.println("The minimum GPA required for the English Literature major is " + elMaj.getMinGPA() + ".");
		
	System.out.println();  //Create blank line to separate outputs
		 
	//Print out array list to display the over ridden toString methods
	for(int i = 0; i < majorList.size(); i++) {  
		System.out.println(majorList.get(i));  
	}
	 }
}

import java.util.Scanner;  //Needed for Scanner
import java.io.BufferedReader;  //Needed for BuffReader, which is used to store text file into array
import java.io.File;            //Needed for File and FileReader
import java.io.FileReader;     

/*
* Jannie Sanchez
* Assignment #8
* Instructor: Sergio Pisano
* Date: April 19, 2020
*/
public class BabyNameDriver { 

public static void nameSel(String sl)   throws Exception{   //Method used for name selection
		String answer;
		Scanner in = new Scanner(System.in);
		System.out.println("Is the name acceptable? Y/N");
		answer = in.nextLine();
		 //Will request last name and expected date of birth for the NewBorn class if user accepts first name
		 if(answer.equalsIgnoreCase("Y")) {
			 System.out.println("\nEnter last name: ");
			 	String lastName = in.nextLine();
			 	System.out.println("Enter expected date of birth: ");
			 	String birthDate = in.nextLine();
			 	NewBorn n = new NewBorn(sl, lastName, birthDate);  //creating instance of NewBorn Class
			 	System.out.println(n);
			 	System.exit(0);
					 }
		 else  {  //Will give user the option to exit program if name is not acceptable
			 System.out.println("Would you like to exit the program? Y/N"); 
			 String input = in.next();
			 if(input.equalsIgnoreCase("Y")) {
				 System.exit(0); }
			 else {
				BabyNameDriver.main(null);  //Will restart program 
			 }
		 } 
		 in.close();  //Close Scanner
	 		}
	
public static void main(String[] args)	throws Exception {
	
	File file = new File("newbornNames.txt");    //Reading text file to store in array
	BufferedReader br = new BufferedReader(new FileReader(file));
	String[] babyNames=new String[400];
	String st;
	int i=0;
	while ((st = br.readLine()) != null) {  //Will continue to store text into string array until no lines are left
		babyNames[i]=st;
	    i++;
	}
	int choice;
	boolean exit=true;
	Scanner in = new Scanner(System.in);
	while(exit)  //Will loop around an continue to run the program until exit is accomplished
	{
// Create menu to display options given to the user
	System.out.println("\nBaby Name Generator Menu");
	System.out.println("\nPlease make a selection: ");
	System.out.println("1. Enter a name.");
	System.out.println("2. Request a name suggestion.");
	System.out.println("3. Request 10 names starting with a specific letter.");

	choice = in.nextInt();
	switch(choice) {  //Use switch to receive user input to continue through program
	
	case 1:  //If user chooses option number 1
		int a = 0;
		System.out.println("Please enter the first name: ");
		String nameInput = in.next();
		for(i = 0; i < 400; i++) {
			if(nameInput.equals(babyNames[i])) {   //Will determine if the name input by the user is on the array list
			a = 1;
			break;
			}
		}
		if(a == 1) {  //Will display if name is on the array list
			System.out.println("\nYour choice is a popular name.");  
		}
		else {   //Will display if name is not on the array list
			System.out.println("Your choice is not a popular name.");  
			}
		nameSel(nameInput);  //Using user input name for the nameSel method
		break;

	case 2:  //If user chooses option number 2
		int randomName = ((int)(Math.random()*1000))%400;  //Will generate a random name from the array list
		System.out.println(babyNames[randomName]);
		nameSel(babyNames[randomName]); //Using random name for the nameSel method
		break;
		
	case 3:  //If user chooses option number 3
		System.out.println("Pick the first letter for the name: ");
		char c = in.next().charAt(0);
		int j = 0;     // Will take the letter input by user and pick the first 10 names from the array that begins with that letter
		for(i = 0; i < 400; i++) {
			if(babyNames[i].charAt(0) == c) {
				System.out.println(babyNames[i]);
				j++;
				if(j == 10)
				break;
			}
			}
		}
	}
	in.close(); //close scanner
	br.close();   //close bufferedReader
	
}
}


/* Outputs
 * 
Output #1:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
1
Please enter the first name: 
Joshua

Your choice is a popular name.
Is the name acceptable? Y/N
Y

Enter last name: 
Pestana
Enter expected date of birth: 
February 3, 2021
Child's name is Joshua Pestana and the date of birth is February 3, 2021.

Output #2:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
1
Please enter the first name: 
Jannie
Your choice is not a popular name.
Is the name acceptable? Y/N
Y

Enter last name: 
Sanchez
Enter expected date of birth: 
June 16, 2020
Child's name is Jannie Sanchez and the date of birth is June 16, 2020.


Output #3:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
1
Please enter the first name: 
Jacob

Your choice is a popular name.
Is the name acceptable? Y/N
N
Would you like to exit the program? Y/N
Y


Output #4:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
1
Please enter the first name: 
Jacob

Your choice is a popular name.
Is the name acceptable? Y/N
n
Would you like to exit the program? Y/N
n

Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.


Output #5:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
2
Devon
Is the name acceptable? Y/N
Y

Enter last name: 
Clemens
Enter expected date of birth: 
August 5, 2021
Child's name is Devon Clemens and the date of birth is August 5, 2021.


Output #6:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
2
Bailey
Is the name acceptable? Y/N
N
Would you like to exit the program? Y/N
Y


Output #7:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
2
Isaac
Is the name acceptable? Y/N
n
Would you like to exit the program? Y/N
n

Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.


Output #8:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
3
Pick the first letter for the name: 
J
Jacob
Joshua
Joseph
James
John
Jonathan
Justin
Jose
Jordan
Jack

Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.


Output #9:
Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
3
Pick the first letter for the name: 
P
Patrick
Parker
Paul
Preston
Peter
Peyton
Paige
Peyton
Payton

Baby Name Generator Menu

Please make a selection: 
1. Enter a name.
2. Request a name suggestion.
3. Request 10 names starting with a specific letter.
 * 
 */


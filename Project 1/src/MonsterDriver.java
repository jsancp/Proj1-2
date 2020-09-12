import java.util.Scanner; //Importing scanner class 
import java.util.ArrayList;

/* Author: Jannie Sanchez
 * Eclipse Version 5
 * Driver class that contains the main method for the monster program.
 */

public class MonsterDriver {

public static void main(String [] args) {
	
	//Monster objects
	Monster option1 = new Monster("Undead", "venom","fire", 10, 30);
	Monster option2 = new Monster("Vampire", "hypnosis", "sunlight", 40, 25);
	Monster option3 = new Monster("Witch", "flying", "cold", 30, 20);
	Monster option4 = new Monster("Demon", "shape-shifting", "salt", 10, 40);
	Monster option5 = new Monster("Werewolf", "super-strength", "silver", 50, 50);
	
	//Monster Fighter array
	 ArrayList<Monster> monsterFighter = new ArrayList<Monster>();
	 	monsterFighter.add(option1);
	 	monsterFighter.add(option2);
	 	monsterFighter.add(option3);
	 	monsterFighter.add(option4);
	 	monsterFighter.add(option5);
	

	//Declaring variables 
	String answer;
	String reply;
	int updateSpeed;
	int updateStrength;
	String input;
	boolean pickMonster= true;  //boolean variable to create loop
	Scanner in = new Scanner(System.in); // Defining scanner object
	
	System.out.println("Welcome to Monster Squad!");
	System.out.println();
	
	System.out.println();
	System.out.println("Would you like to customize a Monster Fighter? Yes or No");
	answer= in.nextLine();
	
	while(pickMonster) {  //Loop to continue program until user decides to terminate
		if(answer.equalsIgnoreCase("Yes")) {
	
 	
	 for(Monster fighter: monsterFighter) {  //Updated output for array
		System.out.println("The " + fighter.getType() + " monster's special ability is " 
	 + fighter.getAbility() + ". The monster's weakness is " + fighter.getWeakness() + ". The monster has a speed of " + fighter.getSpeed() 
	 + " and a strength of " + fighter.getStrength() + "."); 
	 }
		//Created menu to assist user	
	 	System.out.println();	
		System.out.println("======== MONSTER MENU ========");
		System.out.println();
		
		System.out.println("1. Monster Type: " + option1.getType());
		
		System.out.println("2. Monster Type: " + option2.getType());
		
		System.out.println("3. Monster Type: " + option3.getType());
		
		System.out.println("4. Monster Type: " + option4.getType());
		
		System.out.println("5. Monster Type: " + option5.getType());
		System.out.println();
		
		System.out.println();
		System.out.println("Please choose a monster from the menu to customize by typing in monster type: ");
		input = in.next();
		
		System.out.println("Please enter monster speed level (0-10): ");
		updateSpeed = in.nextInt();
		
		System.out.println("Please enter monster strength level (0-10): ");
		updateStrength = in.nextInt();
		
		//Takes user inputs for setter methods
		if(input.equalsIgnoreCase("Undead")) {
			option1.changeSpeed(updateSpeed);
			option1.changeStrength(updateStrength);
		}
		else if(input.equalsIgnoreCase("Vampire")) {
			option2.changeSpeed(updateSpeed);
			option2.changeStrength(updateStrength);
		}
		else if(input.equalsIgnoreCase("Witch")) {
			option3.changeSpeed(updateSpeed);
			option3.changeStrength(updateStrength);
		}
		else if(input.equalsIgnoreCase("Demon")) {
			option4.changeSpeed(updateSpeed);
			option4.changeStrength(updateStrength);
		}
		else if(input.equalsIgnoreCase("Werewolf")) {
			option5.changeSpeed(updateSpeed);
			option5.changeStrength(updateStrength);
		}
		else {   //Advise user to restart due to incorrect input
			System.out.println("ERROR: No monster found.Please try again.");
		}
		
		
	 System.out.println("Would you like to customize another monster?: ");
		  	reply = in.next();
		  	in.nextLine();
		  	if(reply.equalsIgnoreCase("Yes")){
		  		System.out.println();
		  		pickMonster = true; }  //Will loop to start of program 
		  	else {
		  		System.out.println ("Thank you and have a nice day.");
		  		pickMonster = false; } //to close loop
		}
		
	}
	in.close();  ///close scanner
}

}

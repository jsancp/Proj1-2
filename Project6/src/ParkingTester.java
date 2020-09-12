import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
/**Author: Jannie Sanchez
Date: 7/31/20
Version: Eclipse Version 5
Desc: Main driver class that stores the stacks, queues and runs the user input 
**/		
public class ParkingTester {

	public static void main(String[] args) {
	
		//Stack that holds parked vehicles in lot.
		Stack<Integer> parkedCars = new Stack<>();
		
		parkedCars.push(55678);
		parkedCars.push(12362);
		parkedCars.push(77898);
		parkedCars.push(12345);
		parkedCars.push(54321);
		parkedCars.push(14725);
		parkedCars.push(36925);
		parkedCars.push(78945);
		parkedCars.push(98765);
		parkedCars.push(36925);
		parkedCars.push(14785);
		parkedCars.push(25874);
		parkedCars.push(85236);
		parkedCars.push(45678);
		parkedCars.push(65432);
		parkedCars.push(45782);
		parkedCars.push(69874);
		parkedCars.push(63214);
		parkedCars.push(95123);
		parkedCars.push(23698);
				
		//Queue list that holds vehicles currently awaiting a parking spot.
		Queue<Integer> parkingQueue = new LinkedList<>();
		parkingQueue.add(88899);
		parkingQueue.add(33366);
		
				//Variables
				String choice;
				String decal;
				String input;
				int license;
				int index;
				boolean continueParking = true;
				
				//Create a new stack to hold vehicles that will be moved to the street in order to retrieve a parked car.
				Stack<Integer> streetCars = new Stack<>();
				
				//Scanner for user input
				Scanner in = new Scanner(System.in);
				
				//Parking lot access menu
				System.out.println("Welcome to the PC Valet parking lot!");
				System.out.println(); //blank line to separate output
				System.out.println("Would you like to access the parking lot?: Y/N");
				input= in.nextLine();

				//Loop to run program until user closes it
				while(continueParking) {
				//Options menu for user
				System.out.println("Please choose an option:\n"
						+ " Input 1 to park a vehicle\n Input -1 to retrieve a vehicle");
				choice = in.nextLine();
					
				    //If statement if user wishes to park vehicle
					if(choice.equalsIgnoreCase("1")) {
						//Asking user if they have permit to park in lot
						System.out.println("Do you have a parking decal for the PC lot?: Y/N");
						decal = in.nextLine();
						
						//If user has correct parking decal
						if(decal.equalsIgnoreCase("Y")) {
							
							System.out.println("Please input your license number: ");
							license = in.nextInt();
							//Calling method to park vehicle in lot
							ParkingLot.canPark(parkedCars, parkingQueue, license); 
						}
							else {  //Output if user does not have correct permit
								System.out.println("Unfortunately, you do not have the correct permit to park at this lot.\n" + 
																"We apologize for any inconveince.");
							}
						}
					
					//If user chooses to retrieve parked vehicle
					else if(choice.equalsIgnoreCase("-1")) {
						System.out.println("Please input your license number: ");
						license = in.nextInt();
						
						//Calculation to receive index required to receive the correct vehicle
						index = parkedCars.size() - parkedCars.indexOf(license);
						
						//Loop to pull all vehicles blocking vehicle that is being retrieved 
						for(int i = 0; i < index; i++) {
						Integer car = parkedCars.pop();
						streetCars.push(car);  //Placing all pulled vehicles into the street stack
						}
						streetCars.pop(); //Removing the vehicle that user has requested
						
						//Put all vehicles left in the street stack back into parking stack 
						while(!streetCars.isEmpty()) {
						parkedCars.push(streetCars.pop()); }
						
						//Calling method to place queued vehicle in parking stack
						ParkingLot.queueToPark(parkedCars, parkingQueue);
						
						System.out.println("Your vehicle is ready for pick up.\n"
								+ "Thank you for choosing our lot. Have a great day!");
						
						}
					else {
						System.out.println("ERROR: Incorrect input. Please try again.");
					}
							
					
					
				//Output to display vehicles parked in lot and those in queue, awaiting parking
					
				System.out.println();	//blank line to separate output
				System.out.println("********** Current vehicles parked in the lot **********");
				System.out.println();//blank line to separate output
				System.out.println(parkedCars); //print current vehicles from parked cars stack
				System.out.println();//blank line to separate output
				System.out.println("********** Current vehicles in queue, awaiting parking **********");
				System.out.println();//blank line to separate output
				System.out.println(parkingQueue); //Print current vehicles in queue
				
				System.out.println();
				
				//Ask user if they would like to continue program
				System.out.println("Press 2 if you would like to continue the program. Press 0 if you would like to exit.");
				  	input = in.next();
				  	in.nextLine();
				  	if(input.equalsIgnoreCase("2")){
				  		System.out.println();
				  		continueParking = true; }
				  	else if(input.equalsIgnoreCase("0")) {
				  		System.out.println ("Thank you and have a nice day.");
				  		continueParking = false; } //to close loop
				  	else {
				  		System.out.println("ERROR: Incorrect input. Please try again.");
				  	}
				}
				in.close();  //Close scanner
	}
	
}

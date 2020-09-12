import java.util.Queue;
import java.util.Stack;
/**Author: Jannie Sanchez
Date: 7/31/20
Version: Eclipse Version 5
Desc: ParkingLot class that holds the method that checks parkingLot stack and adds to queue list.
**/
public class ParkingLot  {


	public ParkingLot() {
	
	}  //Method to check number of vehicles in lot and park vehicles if spot is available
	static void canPark(Stack<Integer> parkedCars, Queue<Integer> parkingQueue, int license) {
	
	//If lot has 20 vehicles then new vehicle will be placed in queue	
	if (parkedCars.size() >= 20) {
		parkingQueue.add(license);
		System.out.println();
		System.out.println("Unfortunately, the parking lot is currently full.\n"
				+ "Your vehicle will be parked once a space becomes available.");
	}
	//If spot is available place vehicle in parking lot stack
	else  {
			parkedCars.push(license);
			System.out.println("Your vehicle has been parked in the PC lot.\n"
					+ "Thank you for choosing out parking lot. Enjoy your day.");
		}
	}
	//Method to move a queue vehicle to the parking lot if there is less than 20 vehicles in lot
	static void queueToPark(Stack<Integer> parkedCars, Queue<Integer> parkingQueue) {
		while(parkedCars.size()< 20) {
			int moveCars = parkingQueue.remove();
			parkedCars.push(moveCars);
	}
	}
	
}

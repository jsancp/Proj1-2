import java.util.ArrayList;
/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Tester program for Abstract classes and subclasses
**/
public class AnimalTester {

	public static void main(String []args) {
		//Create an array list for the Mammal abstract class
		ArrayList<Mammal> animal1 = new ArrayList<Mammal>();
			
			animal1.add(new Horse());
			animal1.get(0).createBio("Mammalia - Equidae", "horse", "omnivore");
			animal1.add(new Cat(40));
			animal1.get(1).createBio("Mammalia - Felidae", "cat", "carnivore");
			animal1.add(new Dolphin(42));
			animal1.get(2).createBio("Mammalia - Delphinus", "dolphin", "carnivore");
			animal1.add(new Zebra());
			animal1.get(3).createBio("Mammalia - Equidae - Equus quagga", "Zebra", "herbivore");
			
			System.out.println("********** Mammal Biographies **********");
			for(Mammal c: animal1) {
				System.out.println(c); //Print the data stored for all classes in the array
				System.out.println(); //Blank space to separate output
			}
			//Using loop to print the compareTo method for the data stored the mammal class array
			System.out.println("The differences in mammal maximum lifespans: ");
			for(int i = 1; i < animal1.size(); i++) {
			if(animal1.get(0).compareTo(animal1.get(i)) == 0) 
	  	         System.out.println("A " + animal1.get(i).getAnimalType() + " has the maximum lifespan for all horses.");
	         if(animal1.get(0).compareTo(animal1.get(i)) == -1)
	             System.out.println("A horse's average life span is less than that of a " + animal1.get(i).getAnimalType() + ".");
	         if(animal1.get(0).compareTo(animal1.get(i)) == 1)
	             System.out.println("The average lifespan of a horse is greater than that of a " + animal1.get(i).getAnimalType() + ".");
	       }
			//Create an array list for the Amphibian abstract class
			ArrayList<Amphibian> animal2 = new ArrayList<Amphibian>();
			
			animal2.add(new Frog(100));
			animal2.get(0).createBio("Amphibia - Anura", "frog", "carnivore");
			animal2.add(new Salamander(500));
			animal2.get(1).createBio("Amphibia - Urodela", "salamander", "carnivore");
			animal2.add(new Toads());
			animal2.get(2).createBio("Amphibia - Bufo Bufo", "toad", "carnivore");
			
			System.out.println(); //Blank space to separate output
			System.out.println(); //Blank space to separate output
			System.out.println("********** Amphibian Biographies **********");
			for(Amphibian c: animal2) {
				System.out.println(c); //Print the data stored for all classes in the array
				System.out.println(); //Blank space to separate output
			}
			//Using loop to print the compareTo method for the data stored the amphibian class array
			System.out.println("The differences in amphibian sizes: ");
			for(int i = 1; i < animal2.size(); i++) {
			if(animal2.get(0).compareTo(animal2.get(i)) == 0) 
	  	         System.out.println();
	         if(animal2.get(0).compareTo(animal2.get(i)) == -1)
	             System.out.println("The largest possible size for a frog is less than that of a " + animal2.get(i).getAnimalType() + ".");
	         if(animal2.get(0).compareTo(animal2.get(i)) == 1)
	             System.out.println("The largest possible size for a frog is greater than that of a " + animal2.get(i).getAnimalType() + ".");
	       }
			 System.out.println("Toads, frogs and slamanders all vary in size, with salamanders growing to the largest possible size for amphibians at 72 inches.");
			 
			//Create an array list for the Reptile abstract class
			 ArrayList<Reptile> animal3 = new ArrayList<Reptile>();
				
			 	animal3.add(new Lizard(4675));
				animal3.get(0).createBio("Reptilia - Lacertilia", "lizard", "omnivore");
				animal3.add(new Snake(600));
				animal3.get(1).createBio("Reptilia - Serpentes", "snake", "carnivore");
				animal3.add(new Turtle());
				animal3.get(2).createBio("Reptilia - Testudines", "turtle", "omnivore");
				
				System.out.println(); //Blank space to separate output
				System.out.println(); //Blank space to separate output
				System.out.println("********** Reptile Biographies **********");
				for(Reptile c: animal3) {
					System.out.println(c); //Print the data stored for all classes in the array
					System.out.println(); //Blank space to separate output
				}
				//Using loop to print the compareTo method for the data stored the reptile class array
				System.out.println("The differences in reptile sizes: ");
				for(int i = 1; i < animal2.size(); i++) {
				if(animal2.get(0).compareTo(animal2.get(i)) == 0) 
		  	         System.out.println();
		         if(animal2.get(0).compareTo(animal2.get(i)) == -1)
		             System.out.println("The largest possible size for a lizard is less than that of a " + animal2.get(i).getAnimalType() + ".");
		         if(animal2.get(0).compareTo(animal2.get(i)) == 1)
		             System.out.println("The largest possible size for a lizard is greater than that of a " + animal2.get(i).getAnimalType() + ".");
		       }
				 System.out.println("Snakes, lizards and turtles all vary in size, with snakes growing to the largest possible size for reptiles at 30 ft.");
	}
}

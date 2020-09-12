/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Cat extends Mammal {
	//Instance variable unique to class
	private int wildCats;
	
	
	public Cat(int numWildCats) {
		super();
		wildCats = numWildCats;
	}
	//Getter method unique to class
	public int getWildCats() {
		return wildCats;
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(20);
		setSize(680);
		setAnimalType(t);
		setDietType(d);
		setHabitat("jungle, desert, swamp or high mountain");
	}
	
	//Overriding toString method
	public String toString() {
		return "The " + getAnimalType() + " is a " + getDietType() + " that belongs to the mammal class. "
				+ "Its' scientific name is " + getFullSn()  + ", with some species weighing up to " + getSize() + " pounds, and on average live up to " 
				+ getMaxLife() + " years. \nThey generally live in a " + getHabitat() + " habitat. There are approximately " + getWildCats() + " species of wild cats.";
	}
}

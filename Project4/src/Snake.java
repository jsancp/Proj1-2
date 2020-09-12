/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Snake extends Reptile {
	//Instance variable unique to class
	private int venomous;
	
	public Snake(int venSnakes) {
		super();
	    venomous = venSnakes;
	}
	//Getter method unique to class
	public int getVenomous() {
		return venomous;
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(50);
		setSize(30);
		setAnimalType(t);
		setDietType(d);
		setHabitat("warm tropical climates or desert ");
	}
	//Overriding toString method
	public String toString() {
		return "The " + getAnimalType() + " is a " + getDietType() + " that belongs to the reptile class. Its' scientific name is " + getFullSn()  + " , some species can grow up to " + getSize() + " ft, and live up to " 
				+ getMaxLife() + " years.\nThey generally live in " + getHabitat() + " habitats. There are " + getVenomous() + " vemonous snake species in the world.";
	
	}
}

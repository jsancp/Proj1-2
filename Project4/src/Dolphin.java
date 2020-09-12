/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Dolphin extends Mammal {
	//Instance variable unique to class
	private int dolSpecies;
	
	public Dolphin(int numDolSpecies) {
		super();
		dolSpecies = numDolSpecies;
	}
	//Getter method unique to class
	public int getDolSpecies() {
		return dolSpecies;
	}
	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(60);
		setSize(12000);
		setHabitat("ocean");
		setDietType(d);
		setAnimalType(t);
	}
	//Overriding toString method
	public String toString() {
		return "The " + getAnimalType() + " is a " + getDietType() + " that belongs to the mammal class. "
				+ "Its' scientific name is " + getFullSn()  + ", with some species weighing up to " + getSize() + " pounds, and on average live up to " 
				+ getMaxLife() + " years.\nThey generally live in an " + getHabitat() + " habitat. There are currently " + getDolSpecies() + " species of dolphins.";
	}
}

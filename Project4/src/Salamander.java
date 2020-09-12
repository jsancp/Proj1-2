/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Salamander extends Amphibian {
	//Instance variable unique to class
	private int numSalSpecies;
	
	public Salamander(int salSpecies) {
		super();
		numSalSpecies = salSpecies;
	}
	//Getter method unique to class
	public int getNumSalSpecies() {
		return numSalSpecies;
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(15);
		setSize(72);
		setAnimalType(t);
		setDietType(d);
		setHabitat("humid forests");
	}
	//Overriding toString method
	public String toString() {
		return "The " + getAnimalType() + " is a " + getDietType() + " that belongs to the amphibian class. Its' scientific name is " + getFullSn()  + " , with some species growing up to " + getSize() + " inches, and on average live up to " 
				+ getMaxLife() + " years.\nThey generally live in a " + getHabitat() + " habitat. There are " + getNumSalSpecies() + " species of salamanders";
	}
}

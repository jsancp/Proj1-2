/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Lizard extends Reptile {
	//Instance variable unique to class
	private int numSpecies;
	
	public Lizard(int lizSpecies) {
		super();
		numSpecies = lizSpecies;
	}
	//Getter method unique to class
	public int getNumSpecies() {
		return numSpecies;
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(15);
		setAnimalType(t);
		setSize(10);
		setDietType(d);
		setHabitat("warm desert, forest, prairie and rocky");	
	}
	//Overriding toString method
	public String toString() {
		return "The " + getAnimalType() + " is a " + getDietType() + " that belongs to the reptile class. Its' scientific name is " + getFullSn()  + " , some species can grow up to " + getSize() + " ft, and live up to " 
				+ getMaxLife() + " years.\nThey generally live in " + getHabitat() + " habitats. There are over " + getNumSpecies() + " lizard species.";
	}

}

/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Subclass that extends from concrete class
**/
public class Zebra extends Horse  {
	
	public Zebra() {
	super();
}
	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(30);
		setSize(880);
		setDietType(d);
		setAnimalType(t);
		setHabitat("grassland, woodland, or shrubland");
	}
	//Overriding toString method
	public String toString() {
		return "The " + getAnimalType() + " is a mammal that is part of the horse family. Its' scientific name is " + getFullSn()  + ". They can weigh up to " + getSize() + " pounds, and on average live up to " 
				+ getMaxLife() + " years.\nThey live in " + getHabitat() + " habitats.";
	}
}

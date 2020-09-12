/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Horse extends Mammal {
	
	public Horse() {
		super();
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(30);
		setSize(890);
		setDietType(d);
		setAnimalType(t);
		setHabitat("grassland, mountainous, or rocky desert");
		
	}


}

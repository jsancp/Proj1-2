/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Toads extends Amphibian {
	
	public Toads() {
		super();
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(12);
		setSize(6);
		setAnimalType(t);
		setDietType(d);
		setHabitat("moist field or grassland");
		
	}

}

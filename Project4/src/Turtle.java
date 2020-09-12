/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Concrete class that extends from abstract class
**/
public class Turtle extends Reptile  {
	
	public Turtle() {
		super();
	}

	//Setting variables for createBio method
	public void createBio(String sn, String t, String d) {
		setFullSn(sn);
		setMaxLife(100);
		setSize(7);
		setAnimalType(t);
		setDietType(d);
		setHabitat("ocean, forest, wetland, and freshwater ");
		
	}

}

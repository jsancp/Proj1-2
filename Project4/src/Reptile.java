/**Author: Jannie Sanchez
Date: 7/19/20
Version: Eclipse Version 5
Desc: Abstract class that implements interface class and the Comparable <T> interface
**/
public abstract class Reptile implements Animal, Comparable<Reptile> {

	//instance variables
	private String animalType;
	private String habitat;
	private int size;
	private int maxLife;
	private String fullSn;
	private String dietType;

public Reptile() {
	animalType = "none";
	habitat = "none";
	size = 0;
	maxLife = 0;
	fullSn = "none";
	dietType = "none";
}
//abstract method to gather all data obtained from each class
public abstract void createBio(String sn, String t, String d);

//Setters and getter methods
public void setFullSn(String sn) {
	fullSn = sn;
}
public String getFullSn() {
	return fullSn;
}
public void setDietType(String d) {
	dietType = d;
}
	public String getDietType() {
		return dietType;
}
public void setMaxLife(int ml) {
	maxLife = ml;
}
public int getMaxLife() {
	return maxLife;
}
public void setSize(int s) {
	size = s;
}
public int getSize() {
	return size;
}
public void setAnimalType(String t) {
	animalType = t;
}
	public String getAnimalType() {
		return animalType;
}
public void setHabitat(String h) {
	habitat = h;
}
	public String getHabitat() {
		return habitat;
}
	//To String method to print all data gathered from class
public String toString() {
	return "The " + getAnimalType() + " is a " + getDietType() + " that belongs to the reptile class. Its' scientific name is " + getFullSn()  + " , some species can grow up to " + getSize() + " ft, and live up to " 
			+ getMaxLife() + " years.\nThey generally live in " + getHabitat() + " habitats.";
}
//Compare to method to compare data from the class
public int compareTo(Reptile obj)
{
    if (maxLife < obj.maxLife)
        return -1;
    else if (maxLife == obj.maxLife)
        return 0;
    else 
        return 1;
}
}

/* Author: Jannie Sanchez
 * Eclipse Version 5
 * Monster class contains all the variables and methods for a Monster
 */
public class Monster {
	
	//declaring variables
	private String monsterType;
	private String monsterAbility;
	private String monsterWeakness;
	private int monsterSpeed;
	private int monsterStrength;
	int speedChange;
	int strengthChange;
	
	//Constructor for Monster object
	public Monster(String type, String ability, String weakness, int speed, int strength) {
		
		monsterType = type;
		monsterAbility = ability;
		monsterWeakness = weakness;
		monsterSpeed = speed;
		monsterStrength = strength;
	}
	
	//Getter methods
	public String getType() {
		return monsterType;
	}
	public String getAbility() {
		return monsterAbility;
	}
	public String getWeakness() {
		return monsterWeakness;
	}
	public int getSpeed() {
		return monsterSpeed;
	}
	public int getStrength() {
		return monsterStrength;
	}

	
	//Setter methods
	public void setType(String newType) {
		monsterType = newType;
	}
	
	public void setAbility(String newAbility) {
		monsterAbility = newAbility;
	}
	public void setWeakness(String newWeakness) {
		monsterWeakness = newWeakness;
	}
	
	public void setSpeed(int newSpeed) {
		monsterSpeed = newSpeed;
	}
	
	public void setStrength(int newStrength) {
		monsterStrength = newStrength;
	}
	
	//Setter methods to update attributes
	public void changeSpeed(int updateSpeed) {
			speedChange = monsterSpeed + updateSpeed;
			setSpeed(speedChange);
			System.out.println("Your monster now has a speed of " + speedChange + ".");
	}
	
	public void changeStrength(int updateStrength) {
		strengthChange = monsterStrength + updateStrength;
		setStrength(strengthChange); 
		System.out.println("Your monster now has a strength of " + strengthChange + ".");
	}
}

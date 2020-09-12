
public class NewBorn {  
	// Declaring variables for NewBorn Class
	String firstName;
	String lastName;
	String birthDate;
	
	
	NewBorn(String firstName, String lastName, String birthDate) {  //Constructor for NewBorn class so that it can be used in Driver
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	public String toString() {  //Will return the new born's information that is taken from the driver class
		return "Child's name is " + firstName + " " + lastName + " and the date of birth is " + birthDate + ".";
	}
	

}

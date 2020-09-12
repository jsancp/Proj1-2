/**
 * myJava extends Homework.
 * 
 * 
 * @author C. Walker 
 * @version 2/24/19
 */
public class Java extends Homework {

	/**
	 * Constructor for objects of class Java
	 */
	
	public Java() {
		super();
	}
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Java");
	}
	
	public void doReading() {
		setPagesRead(getPagesRead() - 4);
	}
}

/**
 * myScience extends Homework.
 * 
 * 
 * @author C. Walker 
 * @version 2/24/19
 */
public class Science extends Homework {
	/**
	 * Constructor for objects of class Science
	 */
	
	public Science() {
		super();
	}
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Science");
	}
	
	public void doReading() {
		setPagesRead(getPagesRead() - 3);
	}
}

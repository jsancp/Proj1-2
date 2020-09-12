/**
 * myMath extends Homework.
 * 
 * 
 * @author C. Walker 
 * @version 2/24/19
 */
public class Math extends Homework {
	/**
	 * Constructor for objects of class Math
	 */
	
	public Math() {
		super();
	}
	public void createAssignment(int p) {
		setPagesRead(p);
		setTypeHomework("Math");
	}
	
	public void doReading() {
		setPagesRead(getPagesRead() - 2);
	}
}

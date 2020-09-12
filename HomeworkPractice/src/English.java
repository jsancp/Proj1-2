/**
 * myEnglish extends Homework.
 * 
 * 
 * @author C. Walker 
 * @version 2/24/19
 */
public class English extends Homework  {
	/**
	 * Constructor for objects of class English
	 */
	public English() {
		super();
	}
	 public void createAssignment(int p) {
		 setPagesRead(p);
		 setTypeHomework("English");
	 }
 public void doReading() {
	 setPagesRead(getPagesRead() - 1);
 }
}

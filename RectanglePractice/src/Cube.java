
public class Cube extends Box
{
	public Cube(int m) {
			super(m, m, m);
	}
	
public int calcArea() {
	int area = 6 * (int)(Math.pow(getHeight(), 2));
	return area;
}

public String toString() {
	 return "The cube has a length of " + getLength() + " a width of " + getWidth() + " and a height of " + getHeight() + ".";
}
}

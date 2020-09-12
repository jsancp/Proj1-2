
public class PrintDigit {

	
	public static void printOut(int n) {
		if(n >= 10)
			printOut(n/10);
		printDigit( n%10);
		
	}

	private static void printDigit(int i) {
		// TODO Auto-generated method stub
		
	}
}

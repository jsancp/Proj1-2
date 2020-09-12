import java.util.Arrays;
import java.util.Collections;
/*Program to solve the problem:
 * Let k = N/2
 */
public class SelectionProblem1 {

	public static void main(String[] args) {
		
		Integer arr[] = new Integer[] {5, 8, 9, 4, 15, 2, 57, 6, 21, 11, 7} ;
		
 		int size = arr.length;
		int k = 0;
 		int j = size - 1;
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.print("The largest number is the array is: " + arr[k]);
		System.out.println();
		System.out.print("The smallest number is the array is: " + arr[j]);	
		
	}

	
}

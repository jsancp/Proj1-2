/**
 * The Helper and Recursive method to verify if a String is a palindrome or not.
 * 
 * @author AG
 * @version 11/02/2007
 *
 * Modified by: AMR
 * Date: 06/18/09
 */
public class RecursivePalindrome {
	 public String formatPalindrome(String z)
	    {
	        String new1 = z.toLowerCase();
	        String new2 = new1.replaceAll("[ .,:;!?]", "");
	        return new2;
	    }
	        
	    public boolean isPalindrome(String c)
	    {
	        String s = formatPalindrome(c);
	       
	       
	       
	        if(s.length() <= 1)
	        {     
	            return true;
	        }
	        else if(s.substring(0, 1).equals(s.substring(s.length() - 1)) )   
	        {
	        	return isPalindrome(s.substring(1,s.length()-1));
	        }    
	        else
	            return false;
	        
	    }
	    
	    public void printPalindrome(String phrase, boolean palindrome)
	    {
	        if(palindrome)
	             System.out.println(phrase + " is a palindrome");
	        else
	             System.out.println(phrase + " is not a palindrome");
	    }
}


import java.util.Stack;

public class Arithmetic {
	
private String exp; 
private String postFix;

	public Arithmetic(String exp) {
		
		this.exp = exp;
		
	}
	
	
	public boolean isBalanced() {
		
		 boolean isBalanced = false;
		 
		Stack<Character> st = new Stack<Character>();
		
		for (int i = 0; i < exp.length(); i++) {
			
			char c = exp.charAt(i);
				
			if(c == '(') 
				st.push(c);
			
			else if(c == ')') {
				if(!st.isEmpty()) {
					st.pop();
					isBalanced = true; }
					else {
						isBalanced = false;
					}
				}
			}
		return isBalanced;
	}	
 public String getPostFix() {
	 return postFix;
 }

 static int Opera(char ch) {
		
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		}
		return -1;
			
	}
	
	public void postFixExpression() {
		postFix = " ";
		Stack <Character> st2 = new Stack <Character>();
		
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			
			if(Character.isLetterOrDigit(c))
				postFix += c;
			else if(c == '(')
				st2.push(c);
			
			else if (c == ')') {
				while(!st2.isEmpty() && st2.peek()== '(') {
					postFix += st2.pop();	
				}
				if(!st2.isEmpty() && st2.peek() != '(')
					break;
				else
					st2.pop();	
			}
			else {
				while(!st2.isEmpty() && Opera(c) <= Opera(st2.peek())) {
					if(st2.peek() == '(')
						 st2.pop();
				}
				st2.push(c);	
			}
		}
		while(!st2.isEmpty()) {
			if(st2.peek() != '('&& st2.peek() != ')')
				postFix += st2.pop();
		}
	}
	
	
	} 



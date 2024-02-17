package LeatEasyProblem;

import java.util.Scanner;
import java.util.Stack;

public class validParentheses {

	public static void main(String[] args) {
	String strs;
	System.out.println("Enter string");
	Scanner sc = new Scanner(System.in);
	strs = sc.nextLine();
	solOfvalidParentheses solOfvalidParentheses = new solOfvalidParentheses();
	boolean output = solOfvalidParentheses.validParantheses(strs);
	System.out.println(output);
	}
}
	class solOfvalidParentheses
	{
		public boolean validParantheses(String strs)
		{
			String output;
			
			Stack<Character> symbol = new Stack<>();
			
			
			for(int i=0 ; i<strs.length() ; i++)
			{
				
				if(strs.charAt(i) == '(' || strs.charAt(i) == '{' || strs.charAt(i) == '[')
				{
					symbol.push(strs.charAt(i));
				}
				else if(strs.charAt(i) == ')' && !symbol.isEmpty() && symbol.peek() == '(' )
				{
					symbol.pop();
				}
				else if(strs.charAt(i) == ']' && !symbol.isEmpty() && symbol.peek() == '[' )
				{
					symbol.pop();
				}
				else if(strs.charAt(i) == '}' && !symbol.isEmpty() && symbol.peek() == '{' )
				{
					symbol.pop();
				}
				else
				{
					return false;
				}
				
				
			}
			
			return symbol.isEmpty();
		}
	}


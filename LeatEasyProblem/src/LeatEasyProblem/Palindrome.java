package LeatEasyProblem;

import java.awt.image.ColorConvertOp;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		SolutionOfPalindrome  sol = new SolutionOfPalindrome();
		Boolean result ;
		result = sol.isPalindrome(num);
		System.out.println(result);
	}

}

class SolutionOfPalindrome {
    public Boolean isPalindrome(int x) {
    	

        String convertedNumber = String.valueOf(x);
        System.out.println("converted number = :"+convertedNumber);
        // reversing the string using StringBuilder
        StringBuilder reverseString = new StringBuilder();
 
        // append a string into StringBuilder input1
        reverseString.append(convertedNumber);
 
        // reverse StringBuilder
        reverseString.reverse();
        
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(false);
 
        // comparing the reversed string and the number
        return (reverseString.toString())
                   .equals(convertedNumber)
            ? true
            : false;
//    	int originalNum = x;
//    	int checkNum  = 0;
//    	do
//    	{
//    		checkNum = (checkNum * 10) + x%10;
//    		x = x/10;
//    	}while(x>=1);
//    	if(checkNum == originalNum)
//    	{
//    		return true;
//    	}
//    	else
//    	{
//    		return false;
//    	}
    }
}

package LeatEasyProblem;

import java.util.HashMap;
import java.util.Scanner;

public class romanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr roman string");
		String roman = sc.nextLine();
		SolutionOfRomanToInteger solroman = new SolutionOfRomanToInteger();
		int output = solroman.romanToInt(roman);
		System.out.println(output);
	}

}

class SolutionOfRomanToInteger
{
public int romanToInt(String s) {
	
	HashMap< Character, Integer> hm = new HashMap<Character , Integer>();
	hm.put('I',1);
	hm.put('V',5);
	hm.put('X',10);
	hm.put('L',50);
	hm.put('C',100);
	hm.put('D',500);
	hm.put('M',1000);
	
	int sum=0;
	
	sum = sum + hm.get(Character.toUpperCase(s.charAt(s.length()-1)));
	for(int i=s.length()-2;i>=0;i--)
	{
		
		if(hm.get(Character.toUpperCase(s.charAt(i))) >= hm.get(Character.toUpperCase(s.charAt(i+1)))  ){
			
			sum = sum + hm.get(Character.toUpperCase(s.charAt(i)));
		}
		else
		{
			sum = sum -  hm.get(Character.toUpperCase(s.charAt(i)));
		}
	}
	return sum;
    }
}

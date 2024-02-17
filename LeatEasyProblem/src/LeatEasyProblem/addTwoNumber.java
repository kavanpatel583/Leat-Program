package LeatEasyProblem;

import java.util.LinkedList;
import java.util.List	;
import java.util.Scanner;

public class addTwoNumber {

	public static void main(String[] args) {
	
	//create linklist	
	LinkedList<Integer> l1 = new LinkedList<Integer>() ; 
	// add data
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Length of linklist - 1");
	int length = sc.nextInt();
	for(int i=0;i<length;i++)
	{
		System.out.println("Enter the number at position "+i);
		l1.add(sc.nextInt());
	}
	
	LinkedList<Integer> l2 = new LinkedList<Integer>() ; 
	System.out.println("Enter Length of linklist - 2");
	int length2 = sc.nextInt();
	for(int i=0;i<length2;i++)
	{
		System.out.println("Enter the number at position "+i);
		l2.add(sc.nextInt());
	}
	
	System.out.println("List = "+l1);
	System.out.println("List = "+l2);
	
	LinkedList<Integer> resultList = new LinkedList<Integer>() ;
	SolutionAddNumber s1 = new SolutionAddNumber();
	resultList =  (LinkedList<Integer>) s1.addTwoNumbers(l1,l2);
	
}
	
}
class SolutionAddNumber {
    public List addTwoNumbers(List l1, List l2) {
    	
    	
    	
    	return l1;
    }
}

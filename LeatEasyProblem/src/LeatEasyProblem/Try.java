package LeatEasyProblem;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc=new Scanner(System.in);
		    //Declaring and creating String array
		    String[] arr=new String[4];
		    
		    //Display default value after declaring
		    System.out.println("Default values of given String array: ");
		    for(int i=0; i<arr.length; i++){
		        System.out.println(arr[i]+"\t");
		    }//find default value of the given array
		    System.out.println("");
		    //initializing value to the array
		    System.out.println("******Initializing array******");
		    System.out.println("Enter "+arr.length+" string values");
		    for(int i=0; i<arr.length; i++){
		        arr[i]=sc.nextLine();
		    }//using the for loop to initializing array
		    
		    //displaying the array elements
		    System.out.println("\n******displaying array elements******");
		    System.out.println("Entered Strings are");
		    for(int i=0; i<arr.length; i++){
		        System.out.println(arr[i]+"\t");
		    }
		
		
		
	}

}

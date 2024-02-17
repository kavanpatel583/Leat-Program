package LeatEasyProblem;

import java.util.Scanner;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		  Scanner scInt=new Scanner(System.in);
		  Scanner sc=new Scanner(System.in);
		    //Declaring and creating String array
		  	System.out.println("how many string you want to Enter");
		  	int num = scInt.nextInt();

		    String[] arr=new String[num];
		    
	    System.out.println("Enter "+arr.length+" string values");
	    for(int i=0; i<arr.length; i++){
	        arr[i]=sc.nextLine();
	    }
	    
		solLongestCommonPrefix14 solLongestCommonPrefix14 = new solLongestCommonPrefix14();
		String output = solLongestCommonPrefix14.longestCommonPrefix(arr);
	
		System.out.println("prefix string = "+output);
	}

}

class solLongestCommonPrefix14
{
	  public String longestCommonPrefix(String[] strs) {
		  String prefix = null;
		  int lowestLength;
		  String preFixMatchString = "";
		  if(strs.length == 0)
		  {
			  return preFixMatchString;
		  }
		  else
		  {
		   lowestLength=strs[0].length();
		  }
		  for(int i=0;i<strs.length;i++)
		  {
			  if(strs.length == 0)
			  {
				  return preFixMatchString;
			  }
              
			  System.out.println(strs[i]);
    
			  lowestLength =  Math.min(lowestLength, strs[i].length());
		  }
		  	  
		  for(int i=0;i<lowestLength;i++)
		  {
			  char current = strs[0].charAt(i);
			  for(int j=0;j<strs.length;j++)
			  {
				  if(strs[j].charAt(i) != current)
				  {
					  return preFixMatchString;
				  }
				  
			  }
			  preFixMatchString = preFixMatchString + current;
		  }
		  return preFixMatchString;
	        
	    }
}

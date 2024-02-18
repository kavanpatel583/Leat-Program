package LeatCode;

public class Merge_Strings_Alternately_1768 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Solution s = new Solution();
		String merged = mergeAlternately("ab","pqrs");
		System.out.print(merged);
	}
	
	 public static String mergeAlternately(String word1, String word2) {		 
		  	String merged = "";
		  	int length = Math.max(word1.length(), word2.length());
		 	for(int i=0; i < length ; i++)
		 	{	
		 		if(i < word1.length())
		 		{
		 			merged = merged + word1.charAt(i);
		 		}
		 		if(i< word2.length())
		 		{	
		 			merged = merged + word2.charAt(i);	
		 		} 			
		 	}
		 	return merged;
	    }
}

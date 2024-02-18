package LeatCode;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class Kids_With_the_Greatest_Number_of_Candies_1431 {

	public static void main(String[] args) {
		List<Boolean> result;
		
		int[] candies = {2,3,5,1,3};
		
		result = kidsWithCandies(candies,3);
		
		System.out.print(result);
	}
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 List<Boolean> result = new ArrayList<>();
		 int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
		 for(int i: candies)
		 {
			if(i+extraCandies >= max)
			{
				result.add(true);		
			}
			else
			{
				result.add(false);
				
			}
		 }

		return result;
		
	    }
}

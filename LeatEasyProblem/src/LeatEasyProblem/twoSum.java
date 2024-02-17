package LeatEasyProblem;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {

	public static void main(String[] args) {
		
		System.out.println("how many number you want to enter");
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int[] arr = new int[e];
		for(int i=0;i<e;i++)
		{
			System.out.println("enter array number");
			arr[i]= sc.nextInt();
		}
		System.out.println("enter target");
		int target = sc.nextInt(); 
		
		Solution so = new Solution();
		
		int[] output = so.twoSum(arr, target);
		System.out.println(output.length);
		System.out.println(Arrays.toString(output));
	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int sum;
        int[] output = new int[2];
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                sum = nums[i]+nums[j];
             if(sum == target)
            {
                output[0]=i;
                output[1]=j;
            }
            }
           
        }
        return output;
}
}


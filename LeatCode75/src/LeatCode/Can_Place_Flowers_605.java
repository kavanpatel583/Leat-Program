package LeatCode;

public class Can_Place_Flowers_605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flower = {0};
		boolean result = canPlaceFlowers(flower,1);
		System.out.print(result);
	}
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		 boolean result;
		 for (int i = 0; i < flowerbed.length; i++) {
	            if (flowerbed[i] == 0) {
	                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
	                boolean nextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

	                if (prevEmpty && nextEmpty) {
	                    flowerbed[i] = 1;
	                    n--;
	                }
	            }
	            
	        }
		 if(n<=0)
		 {
			 result = true;
		 }
		 else
		 {
			 result=false;
		 }
	        return result;
	        
	    }
	 
	 static int countOccurrences(int arr[], int n, int x)
	    {
	        int res = 0;
	        for (int i=0; i<n; i++)
	            if (x == arr[i])
	              res++;
	        return res;
	    }
}

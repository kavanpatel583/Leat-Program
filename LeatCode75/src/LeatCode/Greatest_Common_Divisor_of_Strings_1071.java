package LeatCode;

public class Greatest_Common_Divisor_of_Strings_1071 {

	public static void main(String[] args) {
		String str = gcdOfStrings("ABABABAB","ABAB");
		System.out.println(str);
	}
	public static String gcdOfStrings(String str1, String str2) {
		
		String result="";

		result = gcd(str1,str2);
		return result;
        
    }
	
	public static String gcd(String str1, String str2)
    {
        if (str1.length() < str2.length()) {
            return gcd(str2, str1);
        }

        else if (!str1.startsWith(str2)) {
            return "";
        }
 
        else if (str2.isEmpty()) {
            return str1;
        }
        else {
            return gcd(str1.substring(str2.length()),
                       str2);
        }
    }
}

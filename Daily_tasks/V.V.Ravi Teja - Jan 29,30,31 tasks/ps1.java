package jan30assignments;
import java.util.*;
class ps1 {
	public static void main(String args[])
	{
		 int vCount = 0, cCount = 0;    
         @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	        //Declare a string    
         System.out.println("Enter string:\n");
         
	        String str = scan.next();   
	            
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                        vCount++;    
	            }    
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                cCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonants: " + cCount);    
	}
}

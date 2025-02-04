package jan30;
import java.util.*;
public class Task5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter string:\n");
		String input = scan.next();
        String result = capitalizeAlternate(input);
        System.out.println(result);
    }

    public static String capitalizeAlternate(String str) {
         StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(Character.toLowerCase(currentChar));
            }
        }
        return result.toString();
    }
}

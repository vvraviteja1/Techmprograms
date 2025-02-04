package jan30assignments;
import java.util.*;
@SuppressWarnings("unused")
public class ps4 {
    public static void main(String args[]) {
        String str = "matrix";
        char smallestVowel = Character.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (isVowel(currentChar)) {
                if (currentChar < smallestVowel) {
                    smallestVowel = currentChar;
                }
            }  }
        if (smallestVowel != Character.MAX_VALUE) {
            System.out.println(smallestVowel);
        } else {
            System.out.println("No vowels found");
        }
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}


package jan30assignments;
import java.util.*;
import java.io.*;
import java.util.*;

public class ps2 {
    public static void main(String args[]) {
   
        String str = "xperience";

        str = str.toLowerCase();

        HashSet<Character> hs = new HashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!hs.contains(currentChar)) {
          
                System.out.print(currentChar);
              
                hs.add(currentChar);
            }
        }
    }
}



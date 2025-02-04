package jan30assignments;

public class ps9 {
public static void main(String args[])
{
	String input = "Hey there!";
    
    StringBuilder result = new StringBuilder();
    
    for (int i = 1; i < input.length(); i += 2) {
        result.append(input.charAt(i));
    }
    
    System.out.println(result.toString());
}
}

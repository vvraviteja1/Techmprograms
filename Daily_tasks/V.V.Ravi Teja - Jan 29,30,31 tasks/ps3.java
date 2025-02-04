package jan30assignments;
public class ps3 {
    public static void main(String args[]) {
        // Given input string
        String str = "Hello This is ABCD from XYZ city";

        // Initialize counters for spaces and characters
        int spaceCount = 0;
        int charCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Count spaces
            if (currentChar == ' ') {
                spaceCount++;
            }
            // Count characters (letters only, ignore digits)
            else if (Character.isLetter(currentChar)) {
                charCount++;
            }
        }

        // Print the results
        System.out.println("No of spaces: " + spaceCount);
        System.out.println("No of characters: " + charCount);
    }
}

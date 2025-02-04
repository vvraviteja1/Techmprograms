package jan30assignments;
public class ps8 {
	
	    public static void main(String[] args) {
	        String input = "Hey3 Java   Learners";
	        StringBuilder result = new StringBuilder();
	        String[] words = input.split("\\s+");
	        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
	                char ch = word.charAt(i);
	                if (Character.isLetter(ch)) {
	                    result.append(ch);
	                    break; 	                }
	            }
	        }
	        System.out.println(result.toString());
	    }
	}



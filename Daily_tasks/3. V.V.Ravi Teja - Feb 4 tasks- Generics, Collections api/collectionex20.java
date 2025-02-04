package feb4tasks;
import java.util.LinkedList;

public class collectionex20 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        
        int firstIndex = colors.indexOf("Blue");
        int lastIndex = colors.lastIndexOf("Blue");
        
        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
    }
}

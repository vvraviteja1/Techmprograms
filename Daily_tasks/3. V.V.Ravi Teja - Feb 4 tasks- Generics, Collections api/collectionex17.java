package feb4tasks;
import java.util.LinkedList;

public class collectionex17 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        colors.push("Yellow");
        System.out.println(colors);
    }
}

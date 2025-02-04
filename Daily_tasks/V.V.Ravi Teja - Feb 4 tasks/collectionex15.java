package feb4tasks;
import java.util.LinkedList;

public class collectionex15 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        colors.add(1, "Yellow");
        System.out.println(colors);
    }
}

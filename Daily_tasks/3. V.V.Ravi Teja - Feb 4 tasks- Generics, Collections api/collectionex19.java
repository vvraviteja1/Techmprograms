package feb4tasks;
import java.util.LinkedList;

public class collectionex19 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        colors.add(1, "Yellow");
        colors.add(2, "Purple");
        System.out.println(colors);
    }
}

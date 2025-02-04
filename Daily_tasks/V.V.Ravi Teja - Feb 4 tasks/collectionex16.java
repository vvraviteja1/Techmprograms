package feb4tasks;
import java.util.LinkedList;

public class collectionex16 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        colors.addFirst("Yellow");
        colors.addLast("Purple");
        System.out.println(colors);
    }
}

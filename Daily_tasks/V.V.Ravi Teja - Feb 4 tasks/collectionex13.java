package feb4tasks;
import java.util.LinkedList;

public class collectionex13 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        for (int i = 2; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}

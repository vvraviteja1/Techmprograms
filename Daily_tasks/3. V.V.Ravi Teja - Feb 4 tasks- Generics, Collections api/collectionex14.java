package feb4tasks;
import java.util.LinkedList;

public class collectionex14 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }
}

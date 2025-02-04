package feb4tasks;
import java.util.ArrayList;

public class collectionex2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

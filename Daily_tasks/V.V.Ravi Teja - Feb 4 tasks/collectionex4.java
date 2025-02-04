package feb4tasks;
import java.util.ArrayList;

public class collectionex4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        String color = colors.get(2);
        System.out.println(color);
    }
}

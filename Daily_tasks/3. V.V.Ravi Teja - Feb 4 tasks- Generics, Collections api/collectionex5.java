package feb4tasks;
import java.util.ArrayList;

public class collectionex5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        colors.set(2, "Orange");
        System.out.println(colors);
    }
}

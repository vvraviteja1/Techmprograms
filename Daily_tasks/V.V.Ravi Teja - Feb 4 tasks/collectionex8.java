package feb4tasks;
import java.util.ArrayList;
import java.util.Collections;

public class collectionex8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        Collections.sort(colors);
        System.out.println(colors);
    }
}

package feb4tasks;
import java.util.ArrayList;

public class collectionex3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        colors.add(0, "Purple");
        System.out.println(colors);
    }
}

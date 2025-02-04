package feb4tasks;
import java.util.ArrayList;

public class collectionex7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        boolean exists = colors.contains("Green");
        System.out.println(exists);
    }
}

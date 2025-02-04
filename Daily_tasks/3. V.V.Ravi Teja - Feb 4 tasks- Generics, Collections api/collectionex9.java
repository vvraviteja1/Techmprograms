package feb4tasks;
import java.util.ArrayList;

public class collectionex9 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Blue");
        colors1.add("Green");
        
        ArrayList<String> colors2 = new ArrayList<>(colors1);
        System.out.println(colors2);
    }
}

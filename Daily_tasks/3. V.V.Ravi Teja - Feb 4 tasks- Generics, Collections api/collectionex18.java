package feb4tasks;

import java.util.LinkedList;

public class collectionex18 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        colors.offer("Yellow");
        System.out.println(colors);
    }
}

package feb4tasks;

import java.util.LinkedList;

public class collectionex12 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

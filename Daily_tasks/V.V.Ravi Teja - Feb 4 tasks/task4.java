package feb4tasks;
import java.util.List;
import java.util.ArrayList;
public class task4 {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println(reverseList(numbers));
    }
}
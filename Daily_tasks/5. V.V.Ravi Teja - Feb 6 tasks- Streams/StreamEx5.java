package StreamExamples;
import java.util.Arrays;
import java.util.List;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot");
        long count = strings.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Count: " + count);
    }
}

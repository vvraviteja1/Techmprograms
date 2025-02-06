package StreamExamples;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<String> uppercased = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowercased = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Uppercase: " + uppercased);
        System.out.println("Lowercase: " + lowercased);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class StreamSkip {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> skipped = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(skipped);
    }
}


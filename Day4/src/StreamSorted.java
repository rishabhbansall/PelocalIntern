import java.util.*;
import java.util.stream.Collectors;

public class StreamSorted {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}


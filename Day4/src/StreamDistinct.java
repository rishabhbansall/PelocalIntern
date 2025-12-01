import java.util.*;
import java.util.stream.Collectors;

public class StreamDistinct {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);

        List<Integer> distinct = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinct);
    }
}


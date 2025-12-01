import java.util.*;

public class StreamMax {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        int max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println("Maximum: " + max);
    }
}


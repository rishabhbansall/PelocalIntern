import java.util.*;

public class StreamMin {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        int min = numbers.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}


import java.util.*;
// import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 4);
        
        numbers.stream()
                // .sorted()
                // .limit(5)
                .skip(3)
                .forEach(System.out::println);
        // List<List<Integer>> listOfLists=new ArrayList<>();
        // listOfLists.add(Arrays.asList(1,2,3));
        // listOfLists.add(Arrays.asList(10,11,12));
        // System.out.println(listOfLists);

        //[1,2,3,10,11,12]

        // List<Integer> flattenedList = listOfLists.stream()
        //         .flatMap(list->list.stream())
        //         .collect(Collectors.toList());
        // System.out.println(flattenedList);

    }
}
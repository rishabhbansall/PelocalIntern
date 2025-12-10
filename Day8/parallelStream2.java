package Day8;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class parallelStream2 {
    public static void main(String[] args){
//        ArrayList<Integer> listOfInteger=new ArrayList<>();
//        Stream.iterate(0,no->no+1).limit(20).forEach(no->listOfInteger.add(no));
//        Stream.iterate(0,no->no+1).parallel().limit(20).forEach(no->listOfInteger.add(no));

//        System.out.println(listOfInteger);
//        System.out.println(listOfInteger.size());

        for (int i=0;i<=10;i++) {
//            List<Integer> list = Stream.iterate(0, no -> no + 1).parallel().limit(20).collect(Collectors.toList());
//            List<Integer> list = Stream.iterate(0, no -> no + 1).parallel().limit(20).collect(Collectors.toCollection(()->new ArrayList<Integer>()));
            List<Integer> list = Stream.iterate(0, no -> no + 1).parallel().limit(20).collect(Collectors.toCollection(ArrayList::new));

            System.out.println(list);
            System.out.println(list.size());
        }

    }
}

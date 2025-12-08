package Day7;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class parallelStream2 {
    public static void main(String [] args){
        // ArrayList<Integer> listOfInteger = new ArrayList<>();
        // listOfInteger.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        // Stream<Integer> streamOfInteger = listOfInteger.stream().parallel();
        // streamOfInteger.forEach(no -> System.out.println(no));
        // System.out.println(streamOfInteger.isParallel());
        // // streamOfInteger.forEachOrdered(no->System.out.println(no));


        // ArrayList<Integer> listOfInteger = new ArrayList<>();
        // listOfInteger.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        // Stream<Integer> streamOfInteger = listOfInteger.stream()
        //                                                 .parallel()
        //                                                 .map(no->no*2)
        //                                                 .sequential();
        // streamOfInteger.forEach(no -> System.out.println(no));
        // System.out.println(streamOfInteger.isParallel());
        // // streamOfInteger.forEachOrdered(no->System.out.println(no));


        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        listOfInteger.stream()
                    .parallel()
                    .map(no->no*2)
                    .forEachOrdered(no->System.out.println(no));


    }


}

package Day8;
import java.util.*;

import java.util.ArrayList;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String [] args){

//        ArrayList<Integer> listOfInteger=new ArrayList<>();
//        listOfInteger.addAll(List.of(102,22,55,1,2,3,4,5,6,7,8,9,10));
//        listOfInteger.stream()
//                    .parallel()
//                    .sorted()
//                    .forEachOrdered(System.out::println);


//        ArrayList<Integer> listOfInteger=new ArrayList<>();
//        List<Integer> syncList=Collections.synchronizedList(listOfInteger);
////    ?    ArrayList<Integer> listOfInteger=Collections.synchronizedList(new ArrayList<>()) ;
////        Vector<Integer> listOfInteger=new Vector<>();
//
//        for(int i=0;i<=5;i++) {
//            listOfInteger.clear();
//            Stream.iterate(1, no -> no <= 20, no -> no + 1)
//                    .parallel()
//                    .forEach(no -> syncList.add(no));
//            System.out.println(listOfInteger);
//            System.out.println(listOfInteger.size());
//        }



//        ArrayList<Integer> listOfInteger=new ArrayList<>();
//
//        for(int i=0;i<=5;i++) {
//            listOfInteger.clear();
//            Stream.iterate(1, no -> no <= 20, no -> no + 1)
//                    .parallel()
//                    .forEachOrdered(no -> listOfInteger.add(no));
//            System.out.println(listOfInteger);
//            System.out.println(listOfInteger.size());
//
//        }   //Getting same result as coming in collections.syncronizedList

        long startTime=System.currentTimeMillis();
//        long sum = LongStream.rangeClosed(0,10).sequential().sum();
            //instead of sum using reduce in which operation is assigned with the initial value like 0 here
        long sum = LongStream.rangeClosed(0,10).sequential().reduce(0,(a,b)->a+b);

            System.out.println("sum of no. is: "+sum);
        long endTime=System.currentTimeMillis();
        System.out.println("Time taken in sequential sum: "+(endTime-startTime));


        long startTime1=System.currentTimeMillis();
        long sum1 = LongStream.rangeClosed(0,10).parallel().sum();
        System.out.println("sum of no. is: "+sum1);
        long endTime1=System.currentTimeMillis();
        System.out.println("Time taken in parallel sum: "+(endTime1-startTime1));


    }
}

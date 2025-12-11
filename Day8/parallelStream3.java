package Day8;

import com.sun.jdi.IntegerValue;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class parallelStream3 {
    public static void main(String[] args){
        ArrayList<Integer> listOfInteger=new ArrayList<>();
        for (int i=0;i<=10;i++) {
            listOfInteger.clear();
            Stream.iterate(0, no -> no + 1).limit(10).forEach(no -> listOfInteger.add(no));
            System.out.println(listOfInteger);
            System.out.println(listOfInteger.size());
        }


        System.out.println();
        System.out.println("****************************");
        System.out.println();


        for (int j=0;j<=10;j++) {
            listOfInteger.clear();
            Stream.iterate(0, no -> no + 1).limit(10).parallel().forEach(no -> listOfInteger.add(no));
            System.out.println(listOfInteger);
            System.out.println(listOfInteger.size());
        }

    }
}

import java.util.*;
public class Day4 {
    public static void main(String[] args){
        List<Integer> salaries =Arrays.asList(20000,20000,30000,40000);
        List<Integer> min=salaries.stream()
//                .map(s->s-3000)
                .filter(s->s>30000)
                .map(s->s+1000)
                .toList();
        System.out.println(min);

    }
}
//Daily StreamTask


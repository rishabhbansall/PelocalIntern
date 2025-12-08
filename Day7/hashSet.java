package Day7;
import java.util.*;

public class hashSet {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);  
        if (set.contains(2)){
            System.out.println("Set contains 2");
        }

        set.remove(1);
        if (!set.contains(1)){
            System.out.println("1 has been removed");
        }

        System.out.println(set.size());

        System.out.println(set);

        Iterator<Integer> it =set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

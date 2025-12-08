package Day7;
import java.util.*;

public class hashMap {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",135);
        map.put("China",150);
        map.put("US",30);
        System.out.println(map);

        //search
        if (map.containsKey("India")){
            System.out.println("India is present in the map");
        }
        else{
            System.out.println("India is not present in the map");
        }
        
        //printing values
        System.out.println(map.get("India"));
        System.out.println();

       //iteration
        for (Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
       }
       System.out.println();

       //remove
       map.remove("China");
       System.out.println(map);
       System.out.println();

       //size
       System.out.println("Size of map is "+map.size());
    }
    
}

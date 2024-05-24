package Hashing;
import java.util.*;

public class Hash_Map {
    public static void main(String[] args)
    {
//        Creating
        HashMap<String, Integer> map = new HashMap<>();

//        Insertion
        map.put("Pakistan", 180);
        map.put("Iran", 150);
        map.put("Palestine", 200);

//        Size
        System.out.println(map.size());

//        Print all elements
        System.out.println(map);

//        Iterator
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        Search (containsKey Function)
        if(map.containsKey("Palestine"))
        {
            System.out.println("Key is present in the map");
        }
        else
        {
            System.out.println("Key is not present in the map");
        }

//        get function
        System.out.println(map.get("Palestine"));
        System.out.println(map.get("Xyz"));

    }
}

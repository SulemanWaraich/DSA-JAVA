package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args)
    {

//        Creating
        HashSet<Integer> set = new HashSet<>();

//        Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

//        Size
        System.out.println("size of a set is " + set.size());

//        Print all elements
        System.out.println(set);

//        Iterator
        Iterator i = set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

//        Deletion
        set.remove(1);
        System.out.println(set);

    }
}

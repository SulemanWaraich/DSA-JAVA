package LinkedList;
import java.util.LinkedList;

public class LL_2 {
    public static void main(String[] args)
    {
        LinkedList <String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");


        list.removeFirst();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}

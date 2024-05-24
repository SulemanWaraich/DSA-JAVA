package ArrayList;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args){
//        Creating
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);

        list.add(1,5);
        System.out.println(list);

        list.set(0,10);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

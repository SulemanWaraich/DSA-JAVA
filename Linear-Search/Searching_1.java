package Array;

public class Searching_1 {
    public static String linearSearch(String menu[], String key)
    {
        for(int i=0; i<menu.length; i++)
        {
            if(menu[i] == key)
            {
                return menu[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] menu = {"dosa","samosa","chips"};
        String key = "samosa";
        String result = linearSearch(menu, key);

        if(result == "Not Found")
        {
            System.out.println("Key is not present in this array");
        }
        else
        {
            System.out.println("key is found in an array   " + result);
        }
        }
    }
//            int[] marks = new int[10];
//            marks[0] = 10;
//            marks[1] = 20;
//            marks[2] = 30;
//            marks[3] = 40;
//            System.out.println(marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] );
//
//            int[] subjects = {23,45,67};
//            System.out.println(subjects[0]);

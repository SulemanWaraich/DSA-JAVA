package Lab_File.Lab_2.LabTask;

public class LabTask {
    public static void Array()
    {
        int arr1[] = new int[4];
        int arr2[] = new int[4];
        int arr3[] = new int[4];

        arr1[0] = 12;
        arr1[1] = 22;
        arr1[2] = 32;
        
        arr1[3] = 42;

        arr2[0] = 8;
        arr2[1] = 25;
        arr2[2] = 100;
        arr2[3] = 89;


        for(int i=0; i<arr1.length; i++)
        {
            arr3[i] = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = arr3[i];
        }

        System.out.println("Swapping");
        for(int j=0; j<arr1.length; j++)
        {
            System.out.print(arr1[j] + " ");
        }

        System.out.println();

        for(int j=0; j<arr1.length; j++)
        {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void Merge()
    {
        int arr1[] = new int[4];
        int arr2[] = new int[4];
        int arr3[] = new int[4];

        arr1[0] = 12;
        arr1[1] = 22;
        arr1[2] = 32;
        arr1[3] = 42;

        arr2[0] = 8;
        arr2[1] = 25;
        arr2[2] = 100;
        arr2[3] = 89;


        for(int i=0; i<arr1.length; i++)
        {
            arr3[i] = arr1[i] + arr2[i];
        }

        for(int j=0; j< arr1.length; j++)
        {
            if(j == 0)
            {
                System.out.print("Merged Array ");
            }
            System.out.print(arr3[j] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void Palindrome()
    {
        String arr[] = new String[4];
        arr[0] = "radar";
        arr[1] = "ronaldo";
        arr[2] = "messi";
        arr[3] = "level";


        try {
            for(int i=0; i< arr.length; i++)
            {
                String reverseStr = "";
                for(int j=(arr[i].length()-1); j>=0; j--)
                {
                    reverseStr = reverseStr + arr[i].charAt(j);
                }
                if(arr[i].equals(reverseStr))
                {
                    System.out.println("This string is palindrome");
                }
                else
                {
                    System.out.println("This string is not palindrome");
                }
            }
        }catch (Exception e)
        {
            String ArrayIndexOutOfBoundsException;
        }
    }

    public static void main(String[] args)
    {
        Array();
        Merge();
        Palindrome();
    }
}
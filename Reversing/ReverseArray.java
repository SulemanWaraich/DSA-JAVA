package Array;

public class ReverseArray {

    public static void reverseArr(int num[])
    {
        int first = 0;
        int last = num.length - 1;
        int temp;

        while(first < last)
        {
            temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args)
    {
        int numbers[] = {2,4,6,8,10};
        reverseArr(numbers);
        for(int i=0;i<numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

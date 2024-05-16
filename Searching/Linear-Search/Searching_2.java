package Array;

public class Searching_2 {
    public static int getLargest(int numbers[])
    {
//        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int j=0; j<numbers.length;j++)
        {
            if(smallest > numbers[j])
            {
                smallest = numbers[j];
            }
        }
//
//        for(int i=0; i<numbers.length;i++)
//        {
//            if(largest < numbers[i])
//            {
//                largest = numbers[i];
//            }
//        }
            return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,6,5,4};
        System.out.println("Smallest number is: " + getLargest(numbers));
    }
}

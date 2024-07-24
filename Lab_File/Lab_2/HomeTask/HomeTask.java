package Lab_File.Lab_2.HomeTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeTask {

    public static void Array(int arr[], int key) {
        int sum = 0;
        int mean;
        int newArray[];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        mean = (sum / arr.length);
        System.out.println("Sum of an array " + sum);
        System.out.println("Mean of an array " + mean);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                try {
                    newArray = Arrays.copyOfRange(arr, i, arr.length);  // Corrected range
                    System.out.println("New array starting from key:");
                    System.out.println(Arrays.toString(newArray));  // Print the entire new array
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
                }
                break;  // Exit the loop once the key is found and array is split
            }
        }
    }
    public static void main(String[] args)
    {
        int key = 5;
        int arr[] = new int[7];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        Array(arr,key);
    }
}

package Lab_File.Lab_3.LabTask;

public class LabTask {

    public static void printArr(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i] + " " + i + " ");
        }
    }

    public static void BubbleSort(int arr[])
    {
        int temp;
        for(int i=0;i< arr.length -1;i++)
        {
            for(int j=0; j< arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    public static void SelectionSort(int arr[])
    {
        int smallest;
        int temp;
        for(int i=0; i< arr.length-1;i++)
        {
            smallest = i;
            for(int j= i+1; j< arr.length; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2,3,7,12,10};
//        SelectionSort(arr);
        BubbleSort(arr);
        printArr(arr);
    }
}

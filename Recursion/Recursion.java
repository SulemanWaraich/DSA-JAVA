package Recursion;

public class Recursion {

    public static void sumOfFirstN(int i, int n, int sum)
    {
        if(i == n)
        {
            sum = sum + i;
            System.out.println(sum);
            return;
        }

        sum = sum + i;
        sumOfFirstN(i+1,n,sum);
        System.out.println(i);
    }


    public int sum(int n)
    {
        if(n > 0)
        {
            return n + sum(n-1);
        }
        else
        {
            return 0;
        }
    }

    public static void main(String args[])
    {
        Recursion r = new Recursion();
        int result = r.sum(3);
        System.out.println(result);

        sumOfFirstN(1,10,0);
    }
}

package ArrayBasics;

import java.util.Scanner;

public class CheckPrefEqaulToSuff
{
    static int sumofarray(int arr[])
    {
        int totalsum = 0;
        for (int i =0; i<arr.length; i++)
        {
            totalsum += arr[i];

        }
        return totalsum;
    }
    static boolean PrefEorNotSuff(int arr[]) //check ho rha hai sub array eqaul hai ya nhi 1 dusre ke liye
    {
        int totalsum  =sumofarray(arr);

        int prefsum =0;
        for (int i = 0; i<arr.length; i++)
        {
            prefsum += arr[i];

            int suffixsum = totalsum - prefsum;

            if (suffixsum == prefsum)
            {
                return  true;

            }

        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n +" elements" );
        for (int i =0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        System.out.println("equal partition of array "+     PrefEorNotSuff(arr));

    }

}

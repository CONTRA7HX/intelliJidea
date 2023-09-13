package DSA_14mar;

import java.awt.*;
import java.util.Scanner;

public class RverseAnArray
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i<=arr.length-1; i++)
        {
            arr[i]  =scn.nextInt();
        }
        Reverse(arr);

        for (int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
        }

    }


    public static void Reverse(int array[])
    {

            int  low = 0;
            int high = array.length - 1;

            while (low<high)
            {
            int  ele = array[low];
              array[low] = array[high];
              array[high] = ele;

              low++;
              high--;

        }

    }
}

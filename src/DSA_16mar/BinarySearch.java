package DSA_16mar;

import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }
        int k  = scn.nextInt();
        System.out.println(binarysearch(arr,k));
    }
    public static int binarysearch(int array[],int k)
    {
        int st = 0 , ed = array.length-1;
        while (st<=ed)
        {
            int mid = (st+ed)/2;

            if (array[mid] < k)
            {
                st = mid+1;

            }
            else if (array[mid]<k)
            {
                ed = mid-1;

            }
            else
                return mid; // found that number

        }
        return -1;

    }

}

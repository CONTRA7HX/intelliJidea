package DSA_16mar;

import java.util.Scanner;

public class FindIndexFirst_Last
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i< arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int Fi = firstIndex(arr,data);
        int Li = lastIndex(arr,data);
        System.out.println(Fi);
        System.out.println(Li);
    }
    public static int firstIndex(int arrr[] ,int d)
    {

        int ans = -1;
        int right = 0;
        int left = arrr.length-1;
        while (left<=right)
        {
            int mid = (left+right)/2;
            if (arrr[mid]>d)
            {
                right  = mid-1;
            }
            else if (arrr[mid]<d)
            {
                left = mid+1;
            }
            else
            {
                ans = mid;
                left = mid -1;
            }

        }
        return ans;
    }
    public static int lastIndex(int []array,int d)
    {
        int ans = -1;
        int left = 0;
        int right = array.length-1;
        while (left<=right)
        {
            int mid = (right+left)/2;
            if (array[mid]>d)
            {
                right = mid -1;
            } else if (array[mid]<d)
            {
                left = mid +1;
            }
            else
            {
                ans = mid;
                left = mid + 1;
            }

        }
        return ans;
    }

}

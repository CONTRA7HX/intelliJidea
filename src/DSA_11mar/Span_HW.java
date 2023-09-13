package DSA_11mar;

import java.util.Scanner;

public class Span_HW
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i =0; i<=arr.length-1; i++)
        {
            arr[i] = scn.nextInt();
        }

        int ans = span(arr);
        System.out.println(ans);
    }
    public static int span(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i <= arr.length - 1; i++)
        {

            if (arr[i]>=max)
            {
                max = arr[i];
            }
            if (arr[i]<=min)
            {
                min = arr[i];

            }
        }
        return max-min;
    }
}

package ArrayBasics;

import java.util.Scanner;

public class PrefixRange
{
    static void printArray(int arr[] )
    {
        for (int i = 0; i< arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixsumarrays(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter "+n+"elements ");
        for (int i = 1; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int prefsum[] = prefixsumarrays(arr);
        System.out.println("enter the number of queries");
        int q = sc.nextInt();

        while (q-->0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefsum[r] - prefsum[l-1];
            System.out.println("sum "+ ans);

        }
    }
}

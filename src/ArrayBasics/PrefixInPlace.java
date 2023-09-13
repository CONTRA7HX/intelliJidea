package ArrayBasics;

import java.util.Scanner;

public class PrefixInPlace {
    static int[] prefixsumarrays(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    static void printArray(int[] arr ) //ye bass array ko print  karega bss array dalo
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+"elements ");
        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array");
        printArray(arr);
        System.out.println("ans prefix");
         prefixsumarrays(arr);
         printArray(arr);

    }

}

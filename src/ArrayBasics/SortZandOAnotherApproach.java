package ArrayBasics;

import java.util.Scanner;

public class SortZandOAnotherApproach
{
    static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void ZeroesandOne(int[] arr)
    {
        int n = arr.length;

        int left = 0, right = n-1;

        while (left<right)
        {
            if (arr[left] == 1 && arr[right] ==0)
            {
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left] == 0)
            {
                left++;
            }
            if (arr[right] == 1)
            {
                right--;

            }
        }
    }
    static void printArray(int arr[]  )
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scn.nextInt();
        int []arr = new int[n];

        System.out.println("enter "+n+ "elements");

        for(int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();

        }
        System.out.println("Original array: ");
        printArray(arr);
        ZeroesandOne(arr);
        System.out.println("Sorted array");
        printArray(arr);

    }
}

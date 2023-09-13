package ArrayBasics;

import javax.swing.*;
import java.util.Scanner;

public class SortArrayiNonDecreasingOrder {
    //Q ek array hai use sort karna hai non decreasing order me But uske square ke sath without using array sort method
    static void printArray(int arr[]  )
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }*/

    static int[] sortarraysquare(int arr[] )
    {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans[] = new int[n];
        int k = 0;
        while (left<=right)
        {
            if (Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else
            {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    static void reversearray(int[] array)
    {
        int i = 0,j = array.length-1;   //index i = 0, j = 4
        while (i<j)
        {
            swap(array,i,j);  //ye karega i aur j jo hai unke index swap karega
            i++; // yaha par values swap ho rhi hai 0 index par jo hai wo 4 me gaya
            j--; //and 4th index wala 0 me gaya

        }
    }

    static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

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
        int ans[] = sortarraysquare(arr);
        System.out.println("Sorted array");
        reversearray(ans);
        printArray(ans);
    }

}


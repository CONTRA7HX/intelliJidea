package ArrayBasics;

import java.util.Scanner;

public class RotateArrayInplace

{

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];  //i ki index value swap karni hai
        arr[i] = arr[j];  //j ki index value swap karni hai
        arr[j] = temp;
    }
  //  static void reverse(int[] arr){}

    static void reverse(int[] arr, int i, int j)
    {
        while (i<j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateInplace(int[] arr, int k )
    {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0 , n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    static void printArray(int[] arr )
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    /*static int[] rotate(int[] arr, int k )
    {
        int n = arr.length; // n = arr.length same baat hai
        k = k %n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i<n; i++)
        {
            ans[j++] = arr[i];

        }
        for (int i = 0; i<n-k; i++ )
        {
            ans[j++] = arr[i];

        }
        return ans;


    }*/
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
        System.out.println("Enter k: ");
        int k = scn.nextInt();

        System.out.println("Original array");
        printArray(arr);
        rotateInplace(arr,k);
       // int[] ans = rotate(arr,k);
        System.out.println("Array after rotation ");
        printArray(arr);

    }
}



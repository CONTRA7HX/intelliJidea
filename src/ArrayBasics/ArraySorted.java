package ArrayBasics;

import java.util.Scanner;

public class ArraySorted
{
     static boolean isSorted(int[] arr)
     {
         boolean check = true;
            /*
             i =0
             arr[0] < arr[-1]
              */
         for (int i = 1; i<arr.length; i++)
         {
             if(arr[i]<arr[i-1])
             {
                 check = false;
                 break;

             }
         }
         return check;
     }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
      //  System.out.println("Enter x");
      //  int x = sc.nextInt();

        System.out.println("Is Sorted  "+isSorted(arr));
    }
}

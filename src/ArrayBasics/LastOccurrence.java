package ArrayBasics;

import java.util.Scanner;

public class LastOccurrence
{
    static int lastOcccu(int[] arr, int x)
    {  //is q me sabse last time repeat jo no repeat hua hai wo ayega
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
            {
                lastindex = i;
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("LAST OCCURRENCE OF X " +lastOcccu(arr ,x));
    }
}

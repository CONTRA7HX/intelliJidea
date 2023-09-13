package ArrayBasics;

import java.util.Scanner;

public class CountGreaterElement
{    //is Question me bola hai ki target no se kitne elements bade hai
    static int countGelement(int[] arr, int x)
    {
        int count = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] > x)
            {
                count++;
            }
        }
        return count;
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
        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("COUNT OF X: "+ countGelement(arr, x));


    }
}

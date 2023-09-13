package DSA_11mar;

import java.util.Scanner;

public class FindElinArray
{// q me bola tha ki no ka index find karo particular
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int index = 0; index<=n-1; index++)
        {
            arr[index] = scn.nextInt();
        }
        System.out.println("target ele");
        int elem = scn.nextInt();

        int res = find( arr,elem);
        System.out.println(res);
    }
    public static int find(int arr[],int element)
    {
        for (int index = 0; index<=arr.length-1; index++)
        {
            if (arr[index] == element)
            {
                return index;
            }
        }
        return -1;
    }
}

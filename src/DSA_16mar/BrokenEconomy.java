package DSA_16mar;

import java.util.Scanner;

public class BrokenEconomy
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
            
        }
        int k = scn.nextInt();
        BinarySearch(arr,k);
    }
    public static void BinarySearch(int arra[],int k) {
        int ceil  = 0;
        int floor = 0;

        int low = 0;
        int high = arra.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (k < arra[mid])//left ceil
            {
                high = mid - 1;
                ceil = arra[mid];
            } else if (k > arra[mid]) //right floor
            {
                low = mid + 1;
                floor = arra[mid];
            } else {
//                System.out.println(mid);
                ceil = arra[mid];
                floor = arra[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);

    }
}

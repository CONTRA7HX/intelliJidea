package ArrayBasics;

import java.util.Scanner;

public class PrefixNewArraycreateA
{
    //Q me bola hai ki prefix or indexes number ka sum karke print karao
    //it means ki ar[1] = ar[0]+ ar[1],then ar[2] =
    static int[] prefixsumarrays(int arr[] )
    {
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i<n; i++)
        {
            pref[i++] = arr[i-1] + arr[i];
        }
        return  pref;

    }
    static void printArray(int[] arr ) //ye bass array ko print  karega bss array dalo
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

        public static void main(String[] args) {
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
            int pref[] = prefixsumarrays(arr);
            printArray(pref);
        }
    }


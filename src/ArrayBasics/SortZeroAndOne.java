package ArrayBasics;
import java.util.Scanner;
public class SortZeroAndOne
{

    static void countZerosandon(int []arr)
    {
        //count number of zeroes
        int count = 0;
        int n =  arr.length;
        for (int i = 0; i<n; i++)
        {
            if (arr[i] == 0)
            {
                count++;
            }
        }
        //0 to zeroes-1 : 0, zeroes to n-1 : 1
        for (int i = 0; i<n; i++)
        {
            if (i < count)  //ifi ki value count se kam hai to index me 0 daldo
            {
                arr[i] = 0;   // it means ki jaha bhi 0 ho us index
            }
            else
            {
                arr[i] = 1;
            }
        }
    }
    static void printarray(int []arr)
    {
        for (int i = 0; i<arr.length; i++ )
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
        printarray(arr);
        countZerosandon(arr);
        System.out.println("Sorted array");
        printarray(arr);

    }
}

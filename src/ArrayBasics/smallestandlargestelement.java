package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class smallestandlargestelement
{ //Q me bola tha ki sabse chota element aur sabse bada element find karo
    static int[] SmallestAndLargestElement(int[] arr)  //array return karwana hai isliye int[] lagay
    {

        Arrays.sort(arr); //ye method array ko sort kardeta hai jobhi array ko sort karna hai isko pass kardo
        int[] ans = {arr[0],arr[arr.length - 1]}; //if humne 5 element store karane hai to index 0 se shuru and 4 tkk jayga arr.length isliye -1 kara
        return ans;
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

        int[] ans = SmallestAndLargestElement(arr);
        System.out.println("Smallest: " +ans[0]);
        System.out.println("Largest: " +ans[1]);

    }
}


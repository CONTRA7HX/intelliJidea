package ArrayBasics;
import java.util.Scanner;
public class FindsecLargestNum
{
    static int findmax(int []arr)
    {
        int mx = Integer.MIN_VALUE;   //min value method - me rhta hai agr hjum isko koi +ve assign karnege to iske liye yaha mx hi hoga
        for (int i = 0 ; i<arr.length; i++)
        {
            if (arr[i] > mx)
            {
                mx = arr[i];
            }
        }
        return mx;  //max no mila suppose 9
    }
    static int findSecondMax(int [] arr)
    {
        int mx = findmax(arr);      //ek array hai jo ki mx me store kardiya
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] == mx)  //yah par duplicate check ho rha hai
            {
                arr[i] = Integer.MIN_VALUE;  //yaha par 9 ko -infinity bolkskte hai usse replace kardiya
            }
        }
        int secondmax = findmax(arr);  //ab bapas max nikala and usko print kardiya

        return secondmax;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + "array");
        for (int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

        System.out.println(findSecondMax(arr));
    }
}

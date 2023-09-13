package ArrayBasics;
import java.util.Scanner;
public class RotateNumber
{
    static int[] rotate(int[] arr, int k )  //array return karwana hai obviously to new array create karrhe and usme ans daal rhe hai
    {
        int n = arr.length; // n = arr.length same baat hai
        k = k % n;             //k is for rotaion thik mtlv
        int[] ans = new int[n];
        int j = 0;        //var liya isme ans ki help se value intilialze karwaynge

        for(int i = n-k; i<n; i++) //suppose k is and n is 7 5 n-k = 7-5= 2 to 7
        {                           //dhyan dene wali baat ye hai ki loop 2 se start hua
            ans[j++] = arr[i];     //value ans me store hui

        }
        for (int i = 0; i<n-k; i++ ) //ab baki bacha hua array 0 to 2
        {                            // aur yaha loop 0 to 2 gaya
            ans[j++] = arr[i];       // value store hui

        }
        return ans;                  //ans me array store kawake return karwa liya


    }
    static void printArray(int[] arr )
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
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
        int[] ans = rotate(arr,k);
        System.out.println("Array after rotation ");
        printArray(ans);


    }
}

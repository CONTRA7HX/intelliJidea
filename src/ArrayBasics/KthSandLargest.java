package ArrayBasics;
import java.util.Scanner;
import java.util.Arrays;

public class KthSandLargest {

    static int[] Sorting(int [] arr ,int k)
    {
        Arrays.sort(arr);  //array sort kara -pphle

        int ans [] = { arr[(k-1)] , arr[(arr.length-k)] }; //uske k mtlb konsa largest and smallest 3rd L and S
        return ans; //index banega 3-1 = 0,1,2=3rd smallest miljayga and mtlv length-k(3)
    }


    public static void main(String[] args)
    {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter k th value :");
        int k = sc.nextInt();  //user se input karwane ke liye ek var create kara

        System.out.print("\nEnter size of array :");
        int n =sc.nextInt();                // n no of inputs lene hai

        int arr [] = new int [n];          // array n par of inputs liye
        System.out.println("\nEnter "+n+" elements :");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt() ;       // value jo input li hai intialize kari
        }

        int [] ans =Sorting(arr , k);  //method call  karke values print karwadi
        System.out.println("\n "+k+"th Smallest element : "+ans[0]);
        System.out.println(" "+k+"th Largest element  : "+ans[1]);
    }
}
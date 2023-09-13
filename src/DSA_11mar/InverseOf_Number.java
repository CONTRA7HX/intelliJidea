package DSA_11mar;

import java.util.Scanner;
//h.w
public class InverseOf_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int index = 0; index <= arr.length - 1; index++) {
            arr[index] = scn.nextInt();
        }
        int anss[] = inverse(arr);
        for (int i =0; i<=anss.length-1; i++)
        {
            System.out.println(anss[i]);
        }
    }

    public static int[] inverse(int arr[]) {
        int ans[] = new int[arr.length];
        for (int index = 0; index <= arr.length-1; index++) {
            //yaha par jo bhi index par no hai indx me assign kardi oth index par suppose 3padha
            //hua hai to then
            int val = arr[index];
            //then ab hua kya jo new index create kara tha uske 3rd index par
            // 0 daldo
            ans[val] = index;

        }
        return ans;

    }
}

//package DSA_14mar;
//
//import java.util.Scanner;
//
//public class RotateAnumber
//{
//    public static void main(String[] args) {
//    Scanner nik = new Scanner(System.in);
//
//    int n = nik.nextInt();
//    int arr[] = new int[n];
//
//    for (int  i = 0; i<arr.length-1; i++)
//    {
//        arr[i] = nik.nextInt();
//
//    }
//    int k = nik.nextInt();
//    int res[] = rotate(arr,k);
//
//    }
//    public static int[] reverse(int arrr[])
//    {
//        int low = 0;
//       int high = arrr.length-1;
//       while (high<low)
//       {
//           int ele = arrr[low];
//           arrr[low] = arrr[high];
//           arrr[high] = ele;
//           low++;
//           high--;
//       }
//       return arrr;
//    }
//    public static int [] rotate(int[] array,int k) {
//
//        k = k % array.length;
//        if (k > 0) {
//            k = k + array.length;
//        }
//
//    }
//}

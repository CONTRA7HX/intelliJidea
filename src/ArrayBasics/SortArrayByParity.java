package ArrayBasics;
import java.util.Scanner;
public class SortArrayByParity
{
    //Q me bola ki ek Array hai usko even to odd me sort karo and uska numbering aage piche ya kuch bhi ho sab valid but
    // array is order me hona chaiye Even EVEN E E E Odd Odd d O O O
    static void printarray(int arr[])
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int arr[] , int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;

    }
    static void sortABP(int arr[])
    {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right)
            if (arr[left] % 2 == 1 && arr[right] % 2 ==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
        if (arr[left] %2 == 0)
        {
            left++;
        }
        if (arr[right] % 2 == 1 )
        {
            right--;
        }
    }
    static int[] Revarray(int[] arr) { // method banaya
        int n = arr.length;            //n me array ki length store karayi
        int[] ans = new int[n];        //ek array create kara n length ka

        int i = n - 1, j = 0;     //then jese ki index 0 se jitne no ka array hai usse ek kam jata hai isliye n-1
        while (i >= 0) {          //then condition true hai jab tk false nhi hogi loop nhi stop hoga
            ans[j++] = arr[i--];  // yaha par j index 0 hai and i ke last index me jo bhi hai wo store hoga
        }

        return ans;
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
        System.out.println("Sorted array");
        sortABP(arr);
        printarray(arr);
    }

}

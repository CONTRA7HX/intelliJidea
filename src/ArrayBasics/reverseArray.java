package ArrayBasics;

public class reverseArray {

    static int[] Revarray(int[] arr) { // method banaya
        int n = arr.length;            //n me array ki length store karayi
        int[] ans = new int[n];        //ek array create kara n length ka

        int i = n - 1, j = 0;     //then jese ki index 0 se jitne no ka array hai usse ek kam jata hai isliye n-1
        while (i >= 0) {          //then condition true hai jab tk false nhi hogi loop nhi stop hoga
            ans[j++] = arr[i--];  // yaha par j index 0 hai and i ke last index me jo bhi hai wo store hoga
        }

        return ans;
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

        int[] arr = {1,2,3,4,5,};
        int [] ans = Revarray(arr);  //ab jo bhi array reverse hua tha usko ans wale[] me store kara denge
        printArray(ans);             //a

    }
}



package ArrayBasics;

import java.util.Scanner;

public class FirstRepeatingNumber {//question me bola ki if koi aesa no sabse phkle index par aur repeat ho rha rha ho
    static int firstRepeatingno(int []arr) //static method kisi non static method ko call nhi kar sakta
    {
        int n = arr.length;

        for (int i = 0; i < n; i++) //first no
        {
            for (int j = i + 1; j < n; j++)  //second number
            {
                if (arr[j] == arr[i]) ;  //found ans
                {
                return arr[j];  //jab condition match hojaygi tab uske baad koi bhi iteration nhi hone wali
                }                   //it means method end
        }
    }
        return-1; //jab koi bhi condition match nhi hogi tab automatically loop se bahar aake ye return karega
}

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+ n + "elements");

        for (int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();

        }
        System.out.println("First Repeating Number: "+firstRepeatingno(arr));
    }
}

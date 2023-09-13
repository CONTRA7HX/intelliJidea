package ArrayBasics;

public class REVERSEaRRaay
{
    static void swapInArray(int[] array,int i, int j)
    {
        int temp = array[i];  //i ki index value swap karni hai
        array[i] = array[j];  //j ki index value swap karni hai
        array[j] = temp;

    }

    static void reversearray(int[] array)
    {
        int i = 0,j = array.length-1;   //index i = 0, j = 4
        while (i<j)
        {
            swapInArray(array,i,j);  //ye karega i aur j jo hai unke index swap karega
            i++; // yaha par values swap ho rhi hai 0 index par jo hai wo 4 me gaya
            j--; //and 4th index wala 0 me gaya

        }
    }
    static void printArray(int[] arr )  //print array  function hai isme KOI BHI ARRAY AYEGA AND PRINT HOGA ACCORDING METHOD
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,};
        reversearray(array);
        printArray(array);

    }
}

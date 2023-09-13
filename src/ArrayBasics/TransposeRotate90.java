package ArrayBasics;
import java.util.Scanner;
public class TransposeRotate90 {
    //inplace is valid for square matrices
        static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void transposematrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                //swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
        /*
            1,2,3
            4,5,6
            7,8,9
            i = 0;
            reverseArray({1,2,3})
         */

    static void rotate(int[][] matrix, int n)
    {
        //Transpose
        transposematrix(matrix ,n,n);
        //reverse each row of transposed matrix
        for (int i = 0; i<n; i++)
        {
            reverseArray(matrix[i]);
        }
        //
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows and column  matrix");
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("enter " + totalElements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(matrix);

        rotate(matrix, r);

        System.out.println("Rotation of matrix");
        printMatrix(matrix);
    }
}

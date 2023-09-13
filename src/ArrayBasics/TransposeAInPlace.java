package ArrayBasics;
import java.util.Scanner;
public class TransposeAInPlace
{//inplace is valid for square matrices
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposematrix(int matrix[][],int r,int c)
    {
        for(int i = 0; i<c; i++)
        {
            for (int j = i; j<r; j++)
            {
                //swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter row and columns of matrix");
        int r = scn.nextInt();
        int c = scn.nextInt();
        int matrix[][] = new int[r][c];


        int totalelements =  r*c;
        System.out.println("enter "+totalelements+" elements");

        for (int i = 0; i<r; i++)
        {
            for (int j = 0; j<c; j++)
            {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("transpose of matrix");
       transposematrix(matrix,r,c);
       printMatrix(matrix);

    }
}

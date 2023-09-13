package ArrayBasics;
import java.util.Scanner;

public class AdditonOFMatrices
{
     static void add(int a[][],int r1,int c1,int b[][],int r2,int c2)
     {//here is r1 = row 1 and c1 = column 1 and same r2 , c2
         if (r1 != r2 || c1 != c2) //here its mean no of row is not equal to no of column condition is that
         {
             System.out.println("wrong Input  - Addition not possible ");
             return;
         }

         int sum[][] = new int[r1][c1];  //r1*c1 = no of index create hue intially sabhi me zero hai

         for (int i = 0; i<r1; i++) //no of row
         {
             for (int j = 0; j<c1; j++) // no of colum
             {
                 sum[i][j] = a[i][j] + b[i][j];
             }
         }
         System.out.println("addition of matrix 1 and 22");
         printMatrix(sum);

     }
     static void printMatrix(int matrix[][])
     {
         for (int i = 0; i<matrix.length; i++)
         {
             for (int j = 0; j<matrix[i].length; j++)
             {
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }

     }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number if rows and columns matrix 1 ");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int a [][] = new int[r1][c1];
        System.out.println("enter Matrix values");
        for (int i = 0; i<r1; i++)
        {
            for (int j = 0; j<c1; j++)
            {
                a[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter number if rows and columns matrix 2 ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int  b [][] = new int[r2][c2];
        System.out.println("Enter Matrix values");
        for (int i = 0; i<r2; i++)
        {
            for (int j = 0; j<c2; j++)
            {
                b[i][j] = scn.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        add(a,r1,c1,b,r2,c2);
    }
     }

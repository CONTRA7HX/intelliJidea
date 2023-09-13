package ArrayBasics;

import java.util.Scanner;

public class TransposeArray {
    static void printMatrix(int matrixx[][]) {
        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < matrixx[i].length; j++) {
                System.out.print(matrixx[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int matrixx[][], int r, int c)
    {
        int transpose[][] = new int [c][r]; //column me convert karne par
        for (int i = 0; i<c; i++)
        {
            for (int j = 0; j<r; j++)
            {
                transpose[i][j] = matrixx[j][i];
            }
        }
        return transpose;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number if rows and columns matrix 1 ");
        int r = scn.nextInt();
        int c = scn.nextInt();
        int ans[][] = new int[r][c];
        int totalelements = r*c;
        System.out.println("Enter "+totalelements+"values");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = scn.nextInt();
            }
        }
        System.out.println("Input Matrix");


        System.out.println("Transpose of matrix");


    }
}


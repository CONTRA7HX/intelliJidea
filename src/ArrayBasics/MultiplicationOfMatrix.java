package ArrayBasics;

import java.util.Scanner;

public class MultiplicationOfMatrix {

    static void multiply(int a[][], int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != c2) {
            System.out.println("Multiplication not possible - wrong dimension");
            return;
        }
        int mul[][] = new int[r1][c2]; //intially by default 0 hai new matrix me
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printMatrix(mul);

    }

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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
        int a[][] = new int[r1][c1];
        System.out.println("enter Matrix values");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter number if rows and columns matrix 2 ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter Matrix values");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = scn.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        multiply(a, r1, c1, b, r2, c2);
    }
}


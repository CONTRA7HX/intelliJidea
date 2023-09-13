package DSA_07mar;

import java.util.Scanner;

public class Pattern_6
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nstar = n/2+1;
        int nspace = 1;
        int row = 1;

        while (row<=n)
        {
            for (int i = 1; i<=nstar; i++)
            {
                System.out.print("*\t");
            }
            for (int i = 1; i<=nspace; i++)
            {
                System.out.print("\t");
            }
            for (int i =1; i<=nstar; i++)
            {
                System.out.print("*\t");
            }

            System.out.println();

            //preparation for next row

            if (row<=n/2)
            {
                nstar = nstar-1;
                nspace = nspace+2;

            }
            else
            {
                nstar = nstar+1;
                nspace = nspace -2;
            }
            row++;

        }

    }
}

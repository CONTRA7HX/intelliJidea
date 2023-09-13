package DSA_07mar;

import java.util.Scanner;

public class Pattern_5
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row = 1;
        int nspace = n/2;
        int nstar = 1;

        while (row<=n)
        {
            for (int i = 1; i<=nspace; i++)
            {
                System.out.print("\t");
            }
            for (int i = 1; i<=nstar; i++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            // prep for next row


            if (row<=n/2)
            {
                nspace = nspace-1;
                nstar  = nstar+2;
            }
            else
            {
                nspace = nspace+1;
                nstar = nstar - 2;
            }
            row++;
        }

    }
}

package DSA_09mar;

import java.util.Scanner;

public class Pattern_10
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        int nspaces = n/2;
        int nstar = 1;
        while (row<=n)
        {
            for (int i = 1; i<=nspaces; i++)
            {
                System.out.print("\t");
            }
            for (int i = 1; i<=nstar; i++)
            {
                if (i == 1 || i == nstar)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();

            // preparation for next row

            if (row<=n/2)
            {
                nspaces = nspaces-1;
                nstar = nstar+2;
            }
            else
            {
                nspaces = nspaces + 1;
                nstar = nstar-2;
            }
            row++;
        }

    }
}

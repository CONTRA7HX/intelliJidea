package DSA_07mar;

import java.util.Scanner;

public class pattern_17
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nospaces = n/2;
        int nostar  = 1;
        int row = 1;

        while (row<=n)
        {
            for (int i = 1; i<=nospaces; i++)
            {
                if (row==n/2+1)
                {
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            for (int i = 1; i<=nostar; i++)
            {
                    System.out.print("*\t");
            }
                    System.out.println();
            if (row<=n/2)
            {
                nostar = nostar+1;

            }
            else
                nostar = nostar-1;
                row++;
        }

    }
}

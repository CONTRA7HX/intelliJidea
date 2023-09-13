package DSA_09mar;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nstr = n;

        int nspc = 0;

        for (int i = 1; i <= n; i++) {

            //space print;
            for (int j = 1; j <= nspc; j++)
            {
                System.out.print("\t");
            }
            for (int j = 1; j<=nstr; j++)
            {
                if (i>1 && i<n/2+1 && j>1 && j<nstr)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            //stars
            System.out.println();
            if (i<n/2+1)
            {
                nspc++;
                nstr = nstr -2;
            }
            else
            {
                nspc--;
                nstr = nstr+2;

            }
        }
    }

}

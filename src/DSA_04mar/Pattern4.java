package DSA_04mar;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int row = 1; row<=n; row++)
        {
            int nostar  = n + 1 -row;
            int nospace = n-nostar;
            for (int i = 1; i<=nospace; i++)
            {
                System.out.print("\t");
            }
            for (int i = 1; i<=nostar; i++)
            {
                System.out.print("*\t");
            }

            System.out.println();
        }


    }
}

package DSA_09mar;

import java.util.Enumeration;
import java.util.Scanner;

public class Pattern_15
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int num = 1;
        int row  = 1;
        int nospace = n/2;
        int nostar  = 1;

        while (row<=n)
        {
            for (int i =  1; i<=nospace; i++)
            {
                System.out.print("\t");
            }
            int temp = num;
            for (int i = 1; i<=nostar; i++)
            {
                System.out.print(temp+"\t");
                // prep for next colum
                if (i<=nostar/2)
                {
                    temp = temp+1;
                }
                else
                {
                    temp = temp-1;
                }
            }
            // move to next line
            System.out.println();
            //preparation fpr next row
            if (row<=n/2)
            {
                nospace = nospace-1;
                nostar  = nostar +2;
                num = num +1;
            }
            else
            {
                nospace = nospace+1;
                nostar = nostar -2;
                num = num-1;
            }
            row++;
        }
    }
}

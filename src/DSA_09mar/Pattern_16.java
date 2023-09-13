package DSA_09mar;

import java.util.Scanner;

public class Pattern_16
{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

         int n =scn.nextInt();
         int row = 1;
         //code for first row
         int nostar =  1;
         int nospace = 2*n-1-2;

         while (row<=n)
         {
             //left side
             int val = 1;
             for (int i =1; i<=nostar; i++)
             {
                 System.out.print(val+"\t");
                 val++;
             }
             for (int j = 1; j<=nospace; j++)
             {
                 System.out.print("\t");
             }
             //condition for last row
             if (row==n) nostar = nostar-1;


             //right side
             int val2 = nostar;
             for (int i = 1; i<=nostar; i++)
             {
                 System.out.print(val2+"\t");
                 val2--;
             }
             // for next row or line
             System.out.println();

             //for next row preparation
             nostar++;
             nospace = nospace-2;

             row++;
         }
    }
}

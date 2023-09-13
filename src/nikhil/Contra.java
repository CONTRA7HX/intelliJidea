package nikhil;
import java.util.Scanner;
class Contra {
    public static void main(String[] args)
    {
//        //pattern 5
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int row = 1;
//        int nspace = n/2;
//        int nstar = 1;
//        while (row<=n)
//        {
//            for (int i = 1; i<=nspace; i++)
//            {
//                System.out.print("\t");
//            }
//            for (int i = 1; i<=nstar; i++)
//            {
//                System.out.print("*\t");
//            }
//            //move to next line
//            System.out.println();
//
//            //preparation for next line
//            if (row<=n/2)
//            {
//                nspace = nspace - 1;
//                nstar = nstar  + 2;
//            }
//            else
//            {
//                nspace = nspace + 1;
//                nstar = nstar - 2;
//            }
//            row++;
//
//        }
        //pattern 6
//        Scanner scn = new Scanner(System.in);
//        int n  = scn.nextInt();
//        int row    =  1;
//        int nstar  =  n/2+1;
//        int nspace =  1;
//
//        while (row<=n)
//        {
//            for (int i = 1; i<=nstar; i++)
//            {
//                System.out.print("*\t");
//            }
//            for (int i = 1; i<=nspace; i++)
//            {
//                System.out.print("\t");
//            }
//            for (int i = 1; i<=nstar; i++)
//            {
//                System.out.print("*\t");
//            }
//            // move to next line
//            System.out.println();
//
//            //preparation for next row
//            if (row<=n/2)
//            {
//                nstar = nstar - 1;
//                nspace = nspace +2;
//
//            }
//            else
//            {
//                nstar = nstar +1;
//                nspace = nspace - 2;
//            }
//            row++;
//        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row = 1;
        int  space = n/2+1;
        int star  = 1;

        while (row<=n)
        {
            for (int i =1; i<=space; i++)
            {
                if (row==n/2+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }

            }
            for (int i = 1; i<=star; i++)
            {
                System.out.print("*\t");
            }
            System.out.println();

            if (row<=n/2)
            {
                star = star+1;
            }
            else
            {
                star = star -1;
            }

            row++;
        }

    }


}

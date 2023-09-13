package DSA_14mar;

import java.util.Scanner;

public class Sum_Of_Two_Array
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int ar1[] = new int[n];
        for (int i= 0; i<=ar1.length-1; i++)
        {
            ar1[i] = scn.nextInt();

        }
        int n2 = scn.nextInt();
        int ar2[] = new int[n2];
        for (int i= 0; i<=ar1.length-1; i++)
        {
            ar2[i] = scn.nextInt();
        }
        int res[] = sum(ar1,ar2);
        for (int i =1; i<=res.length-1; i++)
        {
            System.out.println(res[i]);
        }

    }
    public static int[] sum(int ar1[],int ar2[])
    {
        int n1 = ar1.length, n2 = ar2.length;

        int n3 = Math.max(n1,n2);// ye dono me se jo jada badha array hoga usko return karega
        int p1 = n1-1;
        int p2 = n2-1;
        int p3 = n3-1;
        int carry = 0;
        int res[] = new int[n3];

        while (p1>=0 || p2>= 0 )
        {
            int v1 = p1>=0 ? ar1[p1] : 0;
            int v2 = p2>=0 ? ar1[p2] : 0;


            int sum  = v1+v2+carry;

            int digit  = sum %10;
             carry = sum/10;
             res[p3] = digit;

        }
        if (carry != 0)
        {
            int newRes[] = new int[n3+1];
            newRes[0] = carry;
            for (int idx = 1; idx<=newRes.length-1; idx++)
            {
                newRes[idx] = res[idx-1];

            }
            return newRes;
        }
        return res;
    }
}

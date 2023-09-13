package DSA_11mar;

import java.util.Scanner;

public class DigitOf_frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int digit = scn.nextInt();
        int f = getDfrequency(n,digit);
        System.out.println(f);


    }

    public static int getDfrequency(int n, int d) {

        int count = 0;

        while (n != 0)
        {
            int rem = n%10;
            if (rem==d)
            {
                count++;
            }
            n = n/10;
        }
        return count;


    }
}

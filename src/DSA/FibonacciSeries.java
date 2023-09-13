package DSA;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        /*you've to print fibonacci numbers
        2.takes a input 'n' the count of fibonacci numbers to print
        3.print first fibonacci numbers
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i<n; i++)
        {
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;

        }
    }
}

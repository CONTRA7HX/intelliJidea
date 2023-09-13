package DSA_23feb;
import java.util.Scanner;
public class PrintMultiTable
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i<10; i++)
        {
            int ans = n*i;
            System.out.println(n+" * "+i+" = "+ans);
        }

    }
}


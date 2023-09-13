package DSA_04mar;
import java.util.Scanner;
public class pattern2
{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();

        for (int row = 1; row<=n; row++)
        {
            int nostar = n+1 - row;
            for (int i = 1; i<= nostar; i++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }


    }
}

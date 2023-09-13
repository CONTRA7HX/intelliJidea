package DSA_04mar;
import java.util.Scanner;
public class Pattern3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int row = 1; row<=n; row++)
        {
            int nostar = row;

            int nospace = n-nostar;
            {
                for (int space = 1; space<=nospace; space++)
                {
                    System.out.print("\t");
                }
                for (int star = 1; star<=nostar; star++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}

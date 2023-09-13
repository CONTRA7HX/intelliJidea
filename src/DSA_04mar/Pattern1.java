package DSA_04mar;
import java.util.Scanner;
public class Pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            int nostar = row;
            for (int j = 1; j <= nostar; j++) {


                System.out.print("*\t");

            }
            System.out.println();
        }


    }
}

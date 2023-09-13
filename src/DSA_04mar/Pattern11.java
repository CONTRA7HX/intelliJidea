package DSA_04mar;

import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int count = 1;
        for (int row = 1; row <= n; row++) {
            int nst = row;
            for (int i = 1; i <= nst; i++) {
                System.out.print(count + "\t");
                count = count + 1; // =  count++ dono hi same hai
            }
            System.out.println();
        }
    }
}



package practices_Q;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        if ((no%5==0) && (no%3==0))
        {
            System.out.println("no is is divisible by both 5&3  ");
        }
        else
            System.out.println("no is not divisible ");
    }
}

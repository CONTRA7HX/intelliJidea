package DSA_23feb;
import java.util.Scanner;
public class ElementsOfSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }
        System.out.println(sum);

        //optimise code by arithmetic progression
        int sumofallelements = (n*(n+1))/2;
        System.out.println(sumofallelements );
    }

}

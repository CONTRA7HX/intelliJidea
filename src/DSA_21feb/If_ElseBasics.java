package DSA_21feb;
import java.util.Scanner;
public class If_ElseBasics {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        if (n1>n2)
        {
            System.out.println("n1 is greater than n2");

        }
        else if(n1<n2)
        {
            System.out.println("n1 is smaller than n2");
        }
        else
        {
            System.out.println("n1 is equal to n2");
        }


    }
}


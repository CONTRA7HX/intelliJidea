package DSA_21feb;
import  java.util.Scanner;
public class OddEven
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rem = n%2;
        if (rem == 1)
        {
            System.out.println("is odd");
        }
        else {
            System.out.println("is even");
        }

    }
}

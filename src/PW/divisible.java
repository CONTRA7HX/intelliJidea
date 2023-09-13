package PW;

import java.util.Scanner;

public class divisible
{
    public static void main(String[] args) { //&&>!priority
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        if ( no%15!=0 || (no%5==0 && no%3==0) )
        {
            System.out.println("its divisible by 5or3 but not fifteen");
        }
        else
            System.out.println("not divisible");
    }
}

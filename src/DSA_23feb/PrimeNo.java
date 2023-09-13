package DSA_23feb;
import java.util.Scanner;
public class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int flag = 1; //-> intially no maan ke chal rhe hai no jo hai wo prime hai
        for (int i = 2; i*i<=num; i++)
        {
            if (num % i ==0)
            {
                //number is not prime
                flag = 0;
                break;
            }

        }
        if (flag == 1)
        {
            System.out.println(" is prime");
        }
        else
            System.out.println("not prime ");

        //optimise code of prime no


    }
}

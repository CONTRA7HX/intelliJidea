package practices_Q;
import java.util.Scanner;
public class MultiplicationT
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        int no = sn.nextInt();
        int t = no;
        for (int i = 1; i<=10; i++)
        {
            System.out.println(t+i+" X ="+t*i);
        }

    }
}

package DSA_04mar;
import java.util.Scanner;
public class Pattern12
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int count = n+3;
        int first = 0,second = 1;
        for (int i = 1; i<=7; i++)
        {
            int third = first+second;
            first = second;
            second = third;


        }
        for (int row = 1; row<=n; row++)
        {
            int nostr = row;

            for (int i = 1; i<=nostr; i++)
            {
                System.out.print(first+"\t");
            }
            System.out.println();
        }
    }
}

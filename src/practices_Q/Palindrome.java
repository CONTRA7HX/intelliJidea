package practices_Q;
import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
    Scanner sn = new Scanner(System.in);
    int no,sum = 0,rem,temp;
    no = sn.nextInt();
    temp = no;
    while (no>0) {
        rem = no % 10;
        sum = (sum * 10) + rem;
        no = no / 10;
    }
        if (temp==sum)
        {
            System.out.println("palindrome number");
        }
        else
            System.out.println("its not a palindrome");
    }


}

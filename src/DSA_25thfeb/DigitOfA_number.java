package DSA_25thfeb;
import java.util.Scanner;

public class DigitOfA_number
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num  = scn.nextInt();
        int copyOfNum = num;

        int  temp = 1;

        while (copyOfNum>9)
        {
            copyOfNum = copyOfNum / 10;
            temp = temp*10;
        }
        while (temp!=0)
        {
            int digit = num/temp;

            System.out.println(digit);

            num = num % temp;

            temp = temp /10;

        }
    }
}

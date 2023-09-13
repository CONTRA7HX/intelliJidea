package DSA_02mar;
import java.util.Scanner;
public class SwitchBulb
{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int count = 0;

        for (int i = 1; i*i<=num; i++)
        {
            System.out.println(i*i);

            count++;
        }
        System.out.println("no of bulb is on"+count);
    }
}

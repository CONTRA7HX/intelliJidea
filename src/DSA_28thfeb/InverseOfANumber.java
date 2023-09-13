package DSA_28thfeb;
import java.util.Scanner;
import java.math.*;
public class InverseOfANumber
{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int pos = 1;

        int sum = 0;


        while (num!=0)
        {
            int digit = num%10;

            int v1 = (int) (pos * Math.pow(10,digit-1)); //math.pow by default double value par work karta hai int me karne
                                                        // me karne ke liye int me type casting karte hai
            sum += v1;

            pos++;

            num = num/10;
        }
        System.out.println(sum);
    }
}

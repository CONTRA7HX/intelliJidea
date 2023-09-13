package DSA;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();        // pehele enter krenge kitne input numbeer chaiye ex.5 yimr complexity 10^9
        for (int i = 0; i < t; i++)    //
        {
            int n = scn.nextInt();
            int count = 0;            //variable
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0)            //ye check karra n jo number hai remainder is eqaul to 0  10^9
                {
                    count++;
                }
            }
            if (count == 0)             // yaha par count karrha hai kitni baar divide hua
            {
                System.out.println("prime");
            } else
                System.out.println("not prime");

            {

            }
        }
    }
}
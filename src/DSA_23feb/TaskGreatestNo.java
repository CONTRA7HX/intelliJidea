package DSA_23feb;
import java.util.Scanner;
public class TaskGreatestNo
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        if (n1>n2 && n1>n3)
        {
            System.out.println("n1 is greatest no");
        } else if (n2>n1 && n2>n3) {
            System.out.println("n2 is greatest no");
        }
        else
            System.out.println("n3is greatest no");

        if (n1>n2)
        {  // check n1 is larger than n2
            if (n1>n3)
            {   //check n1 is larger than as well as n3  *agar n1 is smaller than n3 to its mean n3 is greatest no
                System.out.println(n1);  //winner is n1
            }
            else
            {
                System.out.println(n3); //yaha par aajayga control kyulki n1 agar n32 se chota hai to direct aajayga else part me
            }

        } else if (n2>n3)
        {
            System.out.println(n2);
        }
        else
            System.out.println(n3);
    }
}

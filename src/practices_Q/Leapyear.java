package practices_Q;
import java.util.Scanner;
public class Leapyear {
    public static void main(String args[])
    {
        Scanner n = new Scanner(System.in);
        int year = n.nextInt();
        if ((year%400==0) || (year%4==0 && year%100!=0))
        {
            System.out.println("its a leap year");

        }
        else
        System.out.println("its not a leap year");
    }
        }

        /*package practices_Q;
import java.util.Scanner;
public class Leapyear {
    public static void main(String args[])
    {
        Scanner n = new Scanner(System.in);
        int year = n.nextInt();
        if (year%400==0)
        {
            if (year%100==0) {
                if (year % 4 == 0) {
                    System.out.println("its a leap year c " + year);
                }
                else {
                    System.out.println("its not a leap year");
                }
            }
            else
            {
                System.out.println("its a leap year ");
            }
        }
        else
        {
            System.out.println("not a leap year by c1 "+year);
        }
    }
        }

*/

package practices_Q;
import java.util.Scanner;
class Factorial{
        //by recursion
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no");
        int no = s.nextInt();
        int fact;
        Factorial nik = new Factorial();
        fact = nik.CalFact(no);
        System.out.println("Factorial of" + no + " is" + fact);
    }

    int CalFact(int no) {
        if (no >= 1)
        {
            return (no * CalFact(no - 1));
        }
        return 1;
    }
}

/* package practices_Q;
//by recursion
import java.util.Scanner;
class Factorial
{
    static int fact = 1;
    public static void main(String args[])
    {
        int no = 5;
        Factorial nik = new Factorial();
        nik.Calfact(no);
        System.out.println("Factorial of "+no +" is "+fact);

    }
    void  Calfact(int no)
    {
        if (no>=1)
        {
            fact = fact*no;
            Calfact(no-1);
        }
    }
}*/



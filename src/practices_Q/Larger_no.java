package practices_Q;

public class Larger_no {
    public static void main(String args[])
    {
        int a=22,b=27,c=19;
        if (a>b)
        {
            if (a>c)
            {
                System.out.println("a is grater");
            }
            else
            {
                System.out.println("c is greater");

            }

        }
        else if (b>c)
        {
            System.out.println(" b is grater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }

}
/*        int a=22,b=27,c=19;
        if (a>b && a>c)
        {
            System.out.print("A is greatest no among");
        }
        else if (b>c && b>a)
        {
         System.out.print("b is greatest no among");
        }
        else
        {
         System.out.print(c);
        }

*/
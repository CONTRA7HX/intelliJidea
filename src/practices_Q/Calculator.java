package practices_Q;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        String yn;

        do {
            Scanner sn = new Scanner(System.in);
            System.out.println("enter no1 ");
            int no1 = sn.nextInt();
            System.out.println("enter no2 ");
            int no2 = sn.nextInt();
            System.out.println("enter sym(+-*/)");
            String sym = sn.next();
            int res;
            switch (sym)
            {
                case "+" :res = no1+no2;
                System.out.println("Addition is"+res);
                break;
                case "-" :res = no1-no2;
                System.out.println("subtraction is"+res);
                break;
                case "*" : res = no1*no2;
                System.out.println("multiplication is "+res);
                case "/" : res = no1/no2;
                System.out.println("division is "+res);
                break;
            }
            System.out.println("Do you want to continue yes or no");
            yn =sn.next();


        } while (yn.equals("y") || (yn.equals("y")));
    }
}

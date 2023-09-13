package PW;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the length");
        int l =  n.nextInt();
        System.out.println("enter the breadth ");
        int b = n.nextInt();
        int area = l*b;
        int parameter = 2 *(l+b);
        if (area>parameter)
        {
            System.out.println("area is greater than para ");

        } else if (area>=parameter)
        {
            System.out.println("area is equal to parameter ");

        } else if (area<parameter)
        {
            System.out.println("parameter is greater than area");

        }

    }
}

package PW;

import java.util.Scanner;

public class Absolutevalue {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        int n = na.nextInt();
        if (n<0) //if
        {
            n = n*(-1);
        }
        System.out.println("The absolute value is "+n);
    }
}

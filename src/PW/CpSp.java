package PW;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CpSp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter cost price");
        int cp = s.nextInt();
        System.out.println("enter sell price");
        int sp = s.nextInt();
        if (sp>cp)
        {
            System.out.println("your profit "+(sp-cp));
        }
        else
            System.out.println("your loss is : "+(cp-sp));
    }
}

package PW;

import java.util.Scanner;

//given three Points (x1,y1)(x2,y2)and(x3,y3) write a program check if all the three points fall on one straight line
public class GraphQ
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double x1 =1, x2 = 2,x3 = 3, y1 =1, y2 = 2 ,y3 = 3;
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if (m1==m2)
        {
            System.out.println("the three points liw on a single line");
        }
        else
        {
            System.out.println("they do not lie on the same line");
        }

    }
}

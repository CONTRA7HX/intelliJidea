package GeekyShows;

import java.util.Scanner;

public class GettingInputArray
{
    public static void main(String[] args) {
        Scanner nik = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("enter any 5 integer");
        for (int i = 0; i<num.length; i++)
        {
            num[i] = nik.nextInt();
        }
        System.out.println("you entered: ");
        for (int i = 0; i<num.length; i++)
        {
            System.out.print(" "+num[i]);
        }
    }
}

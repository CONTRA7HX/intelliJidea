package GeekyShows;
import java.util.Scanner;
class GettingInputUserTwoD
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enters value ");
        int num[][] = new int[3][4];
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<4; j++)
            {
                num[i][j] = scn.nextInt();
            }

        }
        System.out.println("you entered : ");
        for (int i = 0; i<3; i++)          //this is for printing output
        {
            for (int j = 0; j<4; j++)       //for ex:- i is 0 and j is 0 =11
            {                               //then i is 0 but j is 1 = 22
                System.out.print(num[i][j]); ////for printing output like [0][0] =11
            }                                       //for printing output like [0][1] =22
            System.out.println();                // this is for creating new line after
        }

    }
}
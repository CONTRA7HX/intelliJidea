package GeekyShows;
import java.util.Scanner;
public class TwoDdynamiCMemoryAllocation
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the row size");
        int m = scn.nextInt();
        System.out.println("Enter the colum size");
        int n = scn.nextInt();
        int num[][] = new int[m][n];
        System.out.println("enter value ");
        for (int i = 0; i<num.length; i++)
        {
            for (int j = 0; j<num[0].length; j++)
            {
                num[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                System.out.print(num[i][j] + " ");

            }
        }
        System.out.println();
    }
    }


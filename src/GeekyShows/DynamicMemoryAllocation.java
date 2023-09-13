package GeekyShows;

import java.util.Scanner;

public class DynamicMemoryAllocation
{
    public static void main(String[] args) {
        System.out.println("no of elements: ");
        Scanner store = new Scanner(System.in);
        int n = store.nextInt();
        int num[] = new int[n];   //number of index store in a
        System.out.println("you enter "+n+" integer ");
        for (int i = 0; i<n; i++)
        {
            num[i] = store.nextInt();  //one by one value intialize kar raha hai i me
        }
        System.out.println();
        for (int i = 0; i<n; i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("check element "+num.length);

    }
}
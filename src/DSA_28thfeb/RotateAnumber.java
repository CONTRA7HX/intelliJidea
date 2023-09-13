package DSA_28thfeb;
import java.util.Scanner;
public class RotateAnumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int k = scn.nextInt();

        int count = 0;

        int temproraynum = num;

        while (temproraynum!=0)
        {
            temproraynum = temproraynum/10;

            count++;
                        //count give us to how many  digit in a number
        }
        //Actual rotation
        k = k%count;

        if (k<0)
        {
            k = k +count;
        }

        int temp1 = (int)Math.pow(10,k);

        int p1 = num%temp1;  //part 1 of a number

        int p2 = num/temp1;  //part 2 of a number

        int temp2 = (int)Math.pow(10,count-k);

        int ans = (p1*temp2) + p2;
        System.out.println(ans);


    }



}

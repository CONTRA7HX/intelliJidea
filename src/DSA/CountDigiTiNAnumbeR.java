package DSA;
import java.util.Scanner;
public class CountDigiTiNAnumbeR
{
    public static void main(String[] args){
        //count digit in a number

        Scanner nik = new Scanner(System.in);
        int n = nik.nextInt();
        int dig  = 0;
        while (n!=0)
        {
            n = n/10;
            dig++;
        }
        System.out.println(dig);
    }

}


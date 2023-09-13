package practices_Q;
import java.util.Scanner;
public class ReverseNo
{
    public static void main(String[] args) {
        int no, rem, rev = 0;
        Scanner s = new Scanner(System.in);
        no = s.nextInt();
        while (no != 0) {
            rem = no % 10;
            rev = (rev * 10) + rem;
            no = no / 10;

        }
            System.out.println(rev);
        }
    }

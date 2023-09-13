package practices_Q;
import java.util.Scanner;
public class Even_odd {
    public  static void main(String args[])
    {
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        if (no%2==0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }
}

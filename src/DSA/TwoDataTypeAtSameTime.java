package DSA;
import java.util.Scanner;
class TwoDataTypeAtSameTime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int n = Integer.parseInt(scn.nextLine());
        System.out.println("dear " + name +" here is the counting");
        for (int i = 1; i<= n; i++)
        {
            System.out.println(i);
        }
    }
}


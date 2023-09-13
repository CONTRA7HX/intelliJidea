package practices_Q;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner nik = new Scanner(System.in);
        String name = nik.nextLine();
        String rev = "";
        int lang = name.length();
        for (int i = lang - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

    }
}
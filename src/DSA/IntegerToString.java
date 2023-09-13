package DSA;
import java.util.Scanner;
class IntegerToString {
    public static void main(String[] args) {
        /*1.you are given as input marks of a student
          2.display an appropriate message based on the following rules
          2.1for marks above 90 print excellent
          2.2for marks above 80and less than equal to 90 print good
          2.3for marks above 70 and less than equal to 80 print meets expectation
          for marks less than 60 to print below par
         */

        Scanner nik = new Scanner(System.in);
        System.out.println("enter student marks");
        int marks = nik.nextInt();
        if (marks > 90)
        {
            System.out.println("excellent");

        }
        else if (marks>=60)
        {
            System.out.println("good");
        }
        else if (marks>=60)
        {
            System.out.println("meets expectation");

        }
        else
        {
            System.out.println("below par");
        }


    }
}
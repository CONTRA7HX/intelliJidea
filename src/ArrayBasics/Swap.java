package ArrayBasics;

public class Swap
{
    static void swapNo(int a, int b)
    {
        System.out.println("Original value before swap");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        int c = a; //9
        a = b;   //a=3
        b =c;  //b=9

        System.out.println("value after swap");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        System.out.println("swap no only with 2 var");

        a = a+b;
        b = a-b;
        a = a-b;


    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        int arr[]  ={1,2,3,4,5};

       swapNo(a,b);

    }
}

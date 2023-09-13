package GeekyShows;

public class JaggedArray
{
    public static void main(String []args) {
        int num[][] = new int [3][];

        num[0] = new int[3];
        num[1] = new int [2];
        num [2] = new int [1];

        System.out.println("Array size = "+num.length);
        System.out.println("number of elements in 1st row= "+num[0].length);
        System.out.println("Array size = "+num[1].length);
        System.out.println("Array size = "+num[2].length);
    }

}

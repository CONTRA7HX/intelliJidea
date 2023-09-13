package GeekyShows;

public class JaggedArrayExample
{
    public static void main(String []args) {
        int num[][] = new int [3][];
        int[] num1 ={1,2,3};
        int[] num2 ={4,5};
        int[] num3 ={6};
        num[0] = num1;
        num[1] =num2;
        num[2] =num3;

        for (int i =0;i<num.length;i++)
        {
            for (int j =0; j<num[i].length; i++)
            {
                System.out.print(num[i][j]+ " ");

            }
            System.out.println();
        }

    }
}

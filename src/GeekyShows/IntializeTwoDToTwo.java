package GeekyShows;

public class IntializeTwoDToTwo
{
    public static void main(String []args) {
        int percent[][] = {{11, 22, 33, 44,}, {55, 66, 77, 88}};
        int mark[][];
        mark = percent;
        System.out.println("mark[1][1] =" + mark[1][1]);
        System.out.println("mark[1][2] =" + mark[1][2]);
    }

}

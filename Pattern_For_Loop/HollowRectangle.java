package Pattern_For_Loop;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
            int row =sc.nextInt();
        System.out.print("Enter no of Column: ");
            int column = sc.nextInt();

            int i, j;


        for (i = 0; i < row; i++)
        {
            for (j = 0; j < column; j++)
            {
                if (i == 0 || i==row-1 || j==0 || j==column-1 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");//double space
                }

            }
            System.out.println();

        }
    }
}

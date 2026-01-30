package Pattern_For_Loop;

public class InvertedTriangle {

    public static void main(String[] args) {
        int rows = 6; // number of rows

        for(int i = rows; i >= 1; i--)//rows(how many loops printed)
        {
            for(int j = 1; j <= i; j++) //columns(decides what to print(star alpha num))
            {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}

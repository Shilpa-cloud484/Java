package Pattern_For_Loop;

public class Rectangle {
    public static void main(String[] args) {
        int i,j;
        int row = 4;
        int column = 7;

        for (i=0; i<row; i++){
            for (j=0; j<column; j++)
            {
                System.out.print("* ");
            }
            System.out.println( );
        }

    }
}

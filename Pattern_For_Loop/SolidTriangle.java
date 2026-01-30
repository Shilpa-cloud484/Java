package Pattern_For_Loop;

public class SolidTriangle {
            public static void main(String[] args) {
                int rows = 5; // number of rows

                for(int i = 0; i < rows; i++)//rows(how many loops printed)
                     {
                    for(int j = 0; j <= i; j++) //columns(decides what to print(star alpha num))
                    {
                        System.out.print("* ");
                    }
                    System.out.println(); // move to next line
                }
            }
        }

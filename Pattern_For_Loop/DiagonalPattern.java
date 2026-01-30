package Pattern_For_Loop;

public class DiagonalPattern {

    public static void main(String [] args)
    {
        int i,j;
        int n=10;

        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++)
            {
                if (i==j || j==i)
                {
                    System.out.print("* ");
                }
                    else
                    {
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

package Pattern_For_Loop;

public class CrossPattern {
    public static void main(String[] args)
    {
        int i,j;
        int n=11;
        for (i=0; i<n; i++)
        
        {
            for (j=0; j<n; j++)
            {
                if( i==j ||  i+j==(n-1))


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

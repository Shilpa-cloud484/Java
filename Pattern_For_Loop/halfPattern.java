package Pattern_For_Loop;

public class halfPattern {
        public static void main(String[] args)
        {
            int i,j;
            int n=11;
            for (i=0; i<n; i++)
            {
               for (j=0; j<n; j++)
                {
                    if(  (i+j==(n-1))  ||
                           ((i+j)==((n-1)/2) ||
                                   i>0 && j==((n-1)/2)+i) ||
                            i==j ||
                            ((i-j)==(n-1)/2)//p3
                            ||
                            i+j==(n-1)+(n-1)/2

                    )

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

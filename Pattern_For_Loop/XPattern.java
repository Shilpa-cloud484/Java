package Pattern_For_Loop;

public class XPattern {
        public static void main(String[] args)
        {
            int i,j;
            int n=11;
            for (i=0; i<n; i++)
            {
                for (j=0; j<n; j++) {
                    if (i == j || i + j == (n - 1) || i==0 || j==0 || i==(n-1) ||j==(n-1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                    System.out.print("  ");

                    for (j=0; j<n; j++)
                    {
                        if (i==j && i<(n-1)/2 ||  i+j==n-1 && i<(n-1)/2 ||
                        i==0 || j==0 || i==n-1 || j==n-1 ||
                        j==(n-1)/2 && i>=(n-1)/2)
                        {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                System.out.print("  ");

                for (j=0; j<n; j++)
                {
                    if( i==0 || j==0 || i==n-1|| j==n-1||
                            (i+j==(n-1) && i!=1 && j!=1) && (j!=(n-2)&& i!=(n-2) ) ||
                            (i==1) || (i==(n-2)))


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

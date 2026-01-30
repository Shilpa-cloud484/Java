package ForLoop;

public class NaturalNumberSum {

    public static void main(String[] args) {
        //sum of first 10 natural numbers
        int n = 10;
        int i;
        int sum=0;

        for (i=1; i<=n; i++)
        {
             sum += i;//(n(n+1))/2

        }
        System.out.println("SUM: " +sum);

    }
}

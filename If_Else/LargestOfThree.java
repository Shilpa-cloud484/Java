package If_Else;
import java.util.Scanner;

public class LargestOfThree {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter three numbers below:");
             int a = sc.nextInt();
             int b = sc.nextInt();
             int c = sc.nextInt();

             if (a>b && a>c){
                 System.out.println(a+ " is greatest number.");
             }
             else if (b>a && b>c)
             {
                 System.out.println(b+ " is greatest number.");

             } else if (c>a && c>b)
             {
                 System.out.println(c+ " is greatest number.");

             }
             else
             {
                 System.out.println("Numbers are equal.");
             }

    }
}

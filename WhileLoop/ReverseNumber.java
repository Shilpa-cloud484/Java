package WhileLoop;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int reverse=0;

        while (num !=0)
        {
            int digit = num%10;//2365 -> 5, 236-> 6, 23-> 3, 0
            reverse = reverse*10+digit;//0*10+5=5, 0*10+6, 3
                num /=10;//236, 23, 2

        }
        System.out.println(reverse);//5632

    }
}

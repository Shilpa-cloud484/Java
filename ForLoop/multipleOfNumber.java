package ForLoop;
import  java.util.Scanner;

public class multipleOfNumber {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check multiple: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the multiplier Value: ");
        int num2 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (i % num2 == 0) {
                System.out.println(i+ " is a multiple of " +num2);
            } else {
                System.out.println(i+ " is not a multiple of " +num2);
            }
        }
    }
}

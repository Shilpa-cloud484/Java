package Switch;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1: ");
            int a = sc.nextInt();

        System.out.print("Enter the num2: ");
            int b = sc.nextInt();

        System.out.print("Enter a character: ");
            char op= sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}

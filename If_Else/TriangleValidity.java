package If_Else;
import  java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle1: ");
        int a = sc.nextInt();

        System.out.print("Enter angle2: ");
        int b = sc.nextInt();

        System.out.print("Enter angle3: ");
        int c = sc.nextInt();

        int s = a + b + c;

        if (s == 180 && a>0 && b>0 && c>0) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle.");
        }
    }
}


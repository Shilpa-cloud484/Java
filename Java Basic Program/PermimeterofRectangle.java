package Basics;
import  java.util.Scanner;

public class PermimeterofRectangle {
    public static void main() {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l=sc.nextInt();

        System.out.print("Enter Width: ");
        int w=sc.nextInt();

        int p=2*(l+w);
        System.out.println(p + " is perimeter of Rectangle");


    }
}

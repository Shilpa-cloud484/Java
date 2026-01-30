package If_Else;
import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Scanner;

public class TriangleType {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter side1: ");
            int a = sc.nextInt();

            System.out.print("Enter side2: ");
            int b = sc.nextInt();

            System.out.print("Enter side3: ");
            int c = sc.nextInt();

            // First check validity (Triangle Inequality Theorem)
            if(a + b > c && a + c > b && b + c > a) {
                // Now check type
                if(a == b && b == c) {
                    System.out.println("Equilateral Triangle");
                } else if(a == b || b == c || a == c) {
                    System.out.println("Isosceles Triangle");
                } else {
                    System.out.println("Scalene Triangle");
                }
            } else {
                System.out.println("Not a valid triangle");
            }

            sc.close();
        }
    }

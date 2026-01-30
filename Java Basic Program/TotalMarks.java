package Basics;
import  java.util.Scanner;
public class TotalMarks {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Maths :");
        double m=sc.nextDouble();

        System.out.print("English :");
        double e=sc.nextDouble();

        System.out.print("Hindi :");
        double h=sc.nextDouble();

        System.out.print("Science :");
        double sce=sc.nextDouble();

        double total= m+e+h+sce;

        System.out.println(total    );





    }
}

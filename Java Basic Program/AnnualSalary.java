package Basics;
import java.util.Scanner;

public class AnnualSalary {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Monthly Salary: ");
        int salary = sc.nextInt();

        int annual = salary*12;

        System.out.println(annual + " is the annual Salary.");

    }
}

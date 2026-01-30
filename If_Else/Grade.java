package If_Else;
import  java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of Student: ");
        String name = sc.nextLine();

        System.out.println("Enter the marks of Student: ");
        int n = sc.nextInt();

        if(n>90 && n<=100)
        {
            System.out.println(name + " has passed with A Grade");
        }
        else if (n>80 && n<=90)
        {
            System.out.println(name + " has passed with B Grade");

        }
        else
        {
            System.out.println(name + " has passed with C Grade");
        }


    }
}

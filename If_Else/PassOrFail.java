package If_Else;
import  java.util.Scanner;
import java.util.logging.SocketHandler;

public class PassOrFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of Student: ");
        String name = sc.nextLine();

        System.out.print("Enter the marks:");
        int marks = sc.nextInt();

        if (marks>=37)
        {
            System.out.println(name + " has passed exam with " +marks +" marks.");
        }
        else
        {
            int x = 37-marks;
            System.out.println(name + " has failed the exam by " + x + " marks. ");
        }
    }
}

package If_Else;
import java.util.Scanner;

//integer or not
public class IntegerOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value:");

        double n = sc.nextDouble();//3.14
        int x = (int) n;//Type casting 3

        if (n-x>0)//3-3.14=-0.14

            System.out.println("Number is not an integer");
        else
            System.out.println("Number is integer");



    }
}

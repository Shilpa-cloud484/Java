package If_Else;
import java.util.Scanner;
//----------------------------
//even or odd
//-----------------------------
public class EvenorOdd {
    public static void main() {

        Scanner sh= new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num1= sh.nextInt();
        if (num1 %2 == 0)
            System.out.println("Even");
        else
            System.out.println("odd");

    }

}

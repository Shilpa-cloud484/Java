package If_Else;

import java.util.Scanner;

//divisibilty by 5
public class Divisibility {

    public static void main(String [] args)
    {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num1 = sb.nextInt();
        if(num1%5==0 && num1%11==0)
            System.out.println(num1 + " is Divisile by 5 and 11");
        else
            System.out.println(num1 + " is not Divisile by 5 and 11");
    }
}

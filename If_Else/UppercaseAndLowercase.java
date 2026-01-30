package If_Else;

import java.util.Scanner;

public class UppercaseAndLowercase  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // take first character

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase.");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        sc.close();
    }
}

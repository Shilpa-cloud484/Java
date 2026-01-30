package If_Else;
import  java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char ch = sc.next().charAt(0);
        ch= Character.toLowerCase(ch);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Character is vowel.");
        }
       else if (ch >= 'a' && ch<='z')
    {
            System.out.println("Character is consonant.");
        }
    }
}

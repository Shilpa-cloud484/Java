package If_Else;
import  java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of Voter: ");
        String name = sc.nextLine();

        System.out.print("Enter the Age of Voter: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Nationality of Voter: ");
        String nationality = sc.nextLine();

        if (age>=18 && nationality.equalsIgnoreCase("indian"))
        {
            System.out.println(name +" is eligible to Vote.");
        }
        else
        {
            System.out.println(name + " is not eligible to Vote.");
        }


    }
}

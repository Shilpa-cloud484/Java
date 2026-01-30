package Basics;
import  java.util.Scanner;
//--------------------------------------------------
//        5. Simple interest calculator
//--------------------------------------------------
public class SimpleInterest {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr the principal amount: ");
        double p = sc.nextDouble();

        System.out.print("Enetr the rate: ");
        double r = sc.nextDouble();

        System.out.print("Enetr the time: ");
        double t = sc.nextDouble();

        double ri= (p*r*t)/100;

        System.out.println("Rate of Interest: " + ri);

    }

}
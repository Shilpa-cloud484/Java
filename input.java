package Basics;
import  java.util.Scanner;

public class input{
   /*
    -----------------------------------------------------------------
    1. Take name as input and print greeting
    -----------------------------------------------------------------
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your greeting: " );
        String l =sc.nextLine();
        System.out.println("Greeting: " + l );
    }
}
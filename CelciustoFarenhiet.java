package Basics;
import java.util.Scanner;
/*
----------------------------------------------------------
6. Celsius to Fahrenheit conversion
---------------------------------------------------------
*/
public class CelciustoFarenhiet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature in celcius: ");

        double temp = sc.nextDouble();

        double tempf = (temp * 9 / 5) + 32;
        System.out.println("Temprature in Fahrenheit: " + tempf);
    }
}
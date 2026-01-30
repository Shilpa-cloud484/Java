package If_Else;
import  java.util.Scanner;

public class AtmWithdrawal {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Assume initial balance
            double balance = 10000.0;

            System.out.print("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();

            if (withdraw <= balance && withdraw > 0) {
                balance -= withdraw;
                System.out.println("Withdrawal successful!");
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Withdrawal failed! Insufficient balance or invalid amount.");
            }

            sc.close();
        }
    }


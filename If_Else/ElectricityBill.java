package If_Else;
import  java.util.Scanner;

//--------------------------------------------------
//        7. Electricity bill calculation
//--------------------------------------------------

public class ElectricityBill {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of units: ");
        int unit = sc.nextInt();

        if(unit <=100){
            int b1=unit*5;
            System.out.println("Electricity bill for this month is : " +b1);
        }
        else if(unit>100 && unit <=200){
            int b2=(100*5)+(unit-100)*6;
            System.out.println("Electricity bill for this month is : " +b2);
        }
        else{
            int b3= (100*5)+(100*6)+(unit-200)*7;

            System.out.println("Electricity bill for this month is : " +b3);
        }

        sc.close();


    }
}
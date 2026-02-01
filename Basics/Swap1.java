package Basics;
//------------------------------------------------------
 //5. Swap two numbers (wthout using third variable)
//------------------------------------------------------

public class Swap1 {

    public static void main(String[] args) {
        int a = 20;
        int b = 40;

        System.out.println("Before Swapping");
        System.out.println("Num1:" + a);
        System.out.println("Num2:" + b);

        a = a + b; //20+40=60
        b = a - b; //60-40=20
        a = a - b; //60-20=40


        System.out.println("After Swapping");
        System.out.println("Num1:" + a);
        System.out.println("Num2:" + b);

    }
}
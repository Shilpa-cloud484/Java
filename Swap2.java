package Basics;

//-------------------------------------------------
//6. Swap two numbers ( using third variable)
//--------------------------------------------------

public class Swap2 {

public static void main(String[] args){
    int a= 20;
    int b= 40;
    int temp;

    System.out.println("Before Swapping");
    System.out.println("Num1:" + a);
    System.out.println("Num2:" + b);

    temp=a; //temp=20
    a=b;    //a=40
    b=temp; // b=20


    System.out.println("After Swapping");
    System.out.println("Num1:" + a);
    System.out.println("Num2:" + b);


}
}
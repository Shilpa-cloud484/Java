package If_Else;
import  java.util.Scanner;

public class CountDgt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int count =0;

        System.out.println("Enter the number : ");
           int num= sc.nextInt(); ;

    if (num == 0){
        count=1;
    }
    else
    {
        while (num !=0){
            num =num/10;
            count++;
        }
    }
        System.out.println(count);
    }

}

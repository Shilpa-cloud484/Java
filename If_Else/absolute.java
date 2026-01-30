package If_Else;

import java.util.Scanner;

public class absolute {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n =sc.nextInt();
        /*if(n>=0)
        {
            System.out.println(n);
        }
        else
            System.out.println(-n);*/
        //with out else (primitive conversion)

        if (n<0)
        {
            n=-n;
        }
        System.out.println(n);
    }
}

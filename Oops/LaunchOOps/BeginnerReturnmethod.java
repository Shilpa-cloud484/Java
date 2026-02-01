package Oops.LaunchOOps;

class AddNumber{

    int sum (int a, int b){
        int sum = a+b ;
        return sum;
    }

}

public class BeginnerReturnmethod
{
    public static void main(String[] arg) {

        AddNumber ad = new AddNumber();

        System.out.println("Sum : " + ad.sum(4, 5));
    }
}

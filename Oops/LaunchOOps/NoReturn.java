package Oops.LaunchOOps;

class PrintMessage {

    // method with no return value
    void showMessage() {
        System.out.println("Hello Java");
    }



    public static void main(String[] args) {
        PrintMessage obj = new PrintMessage(); // object creation
        obj.showMessage();                     // method call
    }
}



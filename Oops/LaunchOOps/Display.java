package Oops.LaunchOOps;

class Display {

    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.show(10);
        d.show("Java");
    }
}
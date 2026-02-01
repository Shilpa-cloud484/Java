package Oops.LaunchOOps;

class Addition {

    // method 1
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // method 2 (different number of parameters)
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();

        obj.add(10, 20);      // calls method 1
        obj.add(10, 20, 30);  // calls method 2
    }
}
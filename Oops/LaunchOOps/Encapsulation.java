package Oops.LaunchOOps;

class Stud {

    // private data members (data hiding)
    private int rollNo;
    private String name;

    // setter method
    public void setRollNo(int r) {
        rollNo = r;
    }

    // getter method
    public int getRollNo() {
        return rollNo;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation  {
    public static void main(String[] args) {
        Stud s = new Stud();

        s.setRollNo(101);
        s.setName("Shally");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
    }
}
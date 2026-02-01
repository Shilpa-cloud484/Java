package Oops.LaunchOOps;

class Employee{
    int Emp_ID;
    String Role;
    String name;
    double salary;

    int Work(int id, String rol, String nam, int sal)
    {
        Emp_ID=id;
        Role=rol;
        name=nam;
        salary= sal;

        System.out.println("Employee name is " +nam+ ".");
        System.out.println(nam+ " is working as  " +rol+ ".");
        System.out.println(rol+ " has average salary " +sal+ ".");

        return id;

    }
    void Work(int avgSal, int Experience)
    {
        System.out.println(avgSal+ " is average salary.");
        System.out.println("Total years of experience " + Experience+ " years.");

    }

}

public class MethodOverload {
    static void main(String[] args) {

        Employee emp = new Employee();


        System.out.println("Employee iD : " +emp.Work(681084, "Associate","Shilpa",67000));


        emp.Work(890,8);

    }
}

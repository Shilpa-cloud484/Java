package Oops;

//class student
class Student{
    //has part
    int Id; //instance variable with default value null
    String name;
    Double age;

    //methods(does part)
    void Study()
    {
        String sub= "Math"; // local Variable
        System.out.println("Student Studies "+sub+" for their Exams.");
    }
    void Sleep()
    {
        double hrs =7.30;
        System.out.println("Student sleeps for "+hrs+" hours before their exam.");

    }
}

public class LaunchJava {
    public static void main(String[] args) {
        // object creation
        Student stu = new Student();//stu refrence;;
        //Invoke created object
        stu.Study();//Invoke study method
        stu.Sleep();


    }
}

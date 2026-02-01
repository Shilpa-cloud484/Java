package Oops.LaunchOOps;

class Resource {

    // private variables (data hiding)
    private int id;
    private String name;

    // setter methods using this keyword
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class TestEmploResource {
    public static void main(String[] args) {
        Resource r = new Resource();

        r.setId(101);
        r.setName("Shally");

        System.out.println(r.getId());
        System.out.println(r.getName());
    }
}
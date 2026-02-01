package Switch;

public class NestedSwitch {
    public static void main(String[] args) {
        int dept = 1;
        int emp = 2;

        switch (dept) {
            case 1:
                switch (emp) {
                    case 1:
                        System.out.println("HR Manager");
                        break;
                    case 2:
                        System.out.println("HR Executive");
                        break;
                }
                break;
            case 2:
                System.out.println("IT Department");
                break;
        }

    }
}

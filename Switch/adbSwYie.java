package Switch;

public class adbSwYie {

    public static void main(String[] args) {
        int num = 5;

        String type = switch (num) {
            case 1, 3, 5 -> {
                System.out.println("Odd number");
                yield "ODD";
            }
            case 2, 4 -> {
                System.out.println("Even number");
                yield "EVEN";
            }
            default -> "UNKNOWN";
        };

    }
}

package Switch;

public class SwitchwithString {
    public static void main(String[] args) {

        String browser = "Chrome";

        switch (browser) {
            case "Chrome":
                System.out.println("Opening Chrome");
                break;
            case "Firefox":
                System.out.println("Opening Firefox");
                break;
            case "Edge":
                System.out.println("Opening Edge");
                break;
            default:
                System.out.println("Unsupported browser");
        }
    }
}

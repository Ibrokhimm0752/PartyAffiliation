import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice (D, R, I): ");
        String input = scanner.nextLine().trim().toUpperCase();

        switch (input) {
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
                break;
        }

        if (input.length() == 1) {
            if (input.equals("D") || input.equals("R") || input.equals("I")) {
                System.out.println("Valid input detected.");
            } else {
                System.out.println("Invalid party option.");
            }
        }
        scanner.close();
    }
}
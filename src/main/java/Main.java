import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("      _____");
        System.out.println("     /     \\");
        System.out.println("    | () () |");
        System.out.println("     \\  ^  /");
        System.out.println("      |||||");
        System.out.println("      |||||");
        System.out.println("  _______________");
        System.out.println(" /               \\");
        System.out.println("|  ROBOT WARS!   |");
        System.out.println(" \\_______________/");
        System.out.println("Bitte gib einen Namen für Deinen Roboter ein: ");
        Scanner scanner = new Scanner(System.in);
        String robotName = scanner.nextLine();
            System.out.println("Dein Roboter heisst: " + robotName);
        scanner.nextLine();
    }
}

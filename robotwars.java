import java.util.Scanner;
public class robotwars{
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Geben Sie ihren Benutzernamen ein, bevor es losgeht: ");
        String username = readIn.nextLine();
        System.out.println();

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
        System.out.println("Bitte geben Sie einen Namen für Ihren Roboter ein: ");
        Scanner scanner = new Scanner(System.in);
        String robotName = scanner.nextLine();
        System.out.println("Ihr Roboter heisst: " + robotName);
        System.out.println("Waehle einen Avatar: \n" +
                "Avatar 1 --> §\n" +
                "Avatar 2 --> $\n" +
                "Avatar 3 --> %\n" +
                "Avatar 4 --> &\n" +
                "Avatar 5 --> *\n"
        );
        System.out.println("Waehlen Sie ein Symbol als Avatar oder eine Zahl von 1 bis 5.");
        boolean avatar = true;
        String roboter = "";

        while (avatar) {
            roboter = readIn.nextLine();
            switch (roboter) {
                case "§":
                case "1":
                    roboter = "§";
                    System.out.println(username + " ,dies ist dein Avatar: " + roboter);
                    avatar = false;
                    break;
                case "$":
                case "2":
                    roboter = "$";
                    System.out.println(username + " ,dies ist dein Avatar: " + roboter);
                    avatar = false;
                    break;
                case "%":
                case "3":
                    roboter = "%";
                    System.out.println(username + " ,dies ist dein Avatar: " + roboter);
                    avatar = false;
                    break;
                case "&":
                case "4":
                    roboter = "&";
                    System.out.println(username + " ,dies ist dein Avatar: " + roboter);
                    avatar = false;
                    break;
                case "*":
                case "5":
                    roboter = "*";
                    System.out.println(username + " ,dies ist dein Avatar: " + roboter);
                    avatar = false;
                    break;
                default:
                    System.out.println("Ungueltige Auswahl!");
                    break;
            }
        }
        System.out.println();
        System.out.println("Hier ist Ihr Spielfeld mit Ihrem gewaehlten Avatar: ");
        System.out.println();
        int x = 0;
        int y = 0;
        while (y < 10) {
            x = 0;
            while (x < 15) {
                System.out.print("[  ]");
                x = x + 1;
                if (y == 6 && x == 7) {
                    System.out.print("[ " + roboter + " ]");
                    x++;
                }
            }
            System.out.println();
            y++;
        }

    }


}

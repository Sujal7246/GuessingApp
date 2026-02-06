import java.util.Scanner;

public class GameController {
    public static boolean restartGame(Scanner scanner){
        System.out.println("Do you want to play again (YES/NO):");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}

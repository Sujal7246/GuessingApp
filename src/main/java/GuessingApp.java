import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
   public static void main(String[] args) throws IOException {
       System.out.println("WELCOME TO GUESSING GAME");
       GameConfig gameConfig=new GameConfig();
       gameConfig.showRules();
       Scanner sc=new Scanner(System.in);
       int attempts=0;
       int hintsUsed=0;
       boolean isWin=false;
       while (attempts< gameConfig.getMAX_ATTEMPTS()){
           try {
               System.out.println("Enter your guess");
               String input=sc.nextLine();
               int guess = ValidationService.validateInput(input);
               attempts++;
               String result = GameValidator.validateGuess(guess, gameConfig.getTargetNumber());
               if (!result.equals("CORRECT")
                       && hintsUsed < gameConfig.getMAX_HINTS()) {
                   hintsUsed++;
                   System.out.println(
                           HintService.generateHint(
                                   gameConfig.getTargetNumber(), hintsUsed)
                   );
               }
               System.out.println(result);
               if ("CORRECT".equals(result)) {
                  // System.out.println("YOU WIN 🏆");
                   isWin=true;
                   break;
               }
           }
           catch (InvalidInputException e){
               System.out.println("ERROR: "+e.getMessage());
           }
       }
       //UC5
       StorageService.saveResult("Sujal",attempts,isWin);
       System.out.println("GAME RESULT SAVED");
   }
}

import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
   public static void main(String[] args) throws InvalidInputException{
       System.out.println("WELCOME TO GUESSING GAME");
       GameConfig gameConfig=new GameConfig();
       gameConfig.showRules();
       Scanner sc=new Scanner(System.in);
       int attempts=0;
       int hintsUsed=0;
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
                   System.out.println("YOU WIN 🏆");
                   break;
               }
           }
           catch (InvalidInputException e){
               System.out.println("ERROR: "+e.getMessage());
           }
       }
   }
}

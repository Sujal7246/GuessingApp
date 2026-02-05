import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
   public static void main(String[] args) {
       System.out.println("WELCOME TO GUESSING GAME");
       GameConfig gameConfig=new GameConfig();
       gameConfig.showRules();
       Scanner sc=new Scanner(System.in);
       int attempts=0;
       while (attempts< gameConfig.getMAX_ATTEMPTS()){
           System.out.println("Enter your guess");
           int guess=sc.nextInt();
           attempts++;
           String result=GameValidator.validateGuess(guess,gameConfig.getTargetNumber());
           System.out.println(result);
           if("CORRECT".equals(result)){
               break;
           }
       }
   }
}

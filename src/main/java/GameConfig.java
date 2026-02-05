import java.util.Random;

public class GameConfig {
    private final int MIN=1;
    private final int MAX=100;
    private final int MAX_ATTEMPTS=7;
    private final int MAX_HINTS=3;

    int targetNumber;

    public GameConfig() {
        Random r=new Random();
        this.targetNumber = r.nextInt(MAX-MIN+1)+MIN;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getMIN() {
        return MIN;
    }

    public int getMAX() {
        return MAX;
    }

    public int getMAX_ATTEMPTS() {
        return MAX_ATTEMPTS;
    }

    public int getMAX_HINTS() {
        return MAX_HINTS;
    }
    public void showRules(){
        System.out.println("Guess a number between "+MIN+" and "+MAX);
        System.out.println("You have only "+MAX_ATTEMPTS+" attempts.");
        System.out.println("Hints are given after every wrong guesses.");
    }
}

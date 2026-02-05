public class GameValidator {
    public static String validateGuess(int guess,int target){
        if(guess==target){
            return "CORRECT";
        }else if (guess > target){
            return "HIGH";
        }
        return "LOW";
    }
}

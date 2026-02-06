import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StorageService {
    private static final String FILE_NAME="game_results.txt";
    public static void saveResult(String player,int attempts,boolean isWin) throws IOException {
        try (BufferedWriter writer=new BufferedWriter(new FileWriter(FILE_NAME,true))){
            writer.write("Player: "+player+
                    ", Attempts used: "+attempts+
                    ", Result:"+(isWin ? "WIN🏆":"LOSE😔"));
            writer.newLine();
        }catch (IOException e){
            System.out.println("UNABLE TO SAVE GAME RESULT");
        }
    }
}

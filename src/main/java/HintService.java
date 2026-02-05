public class HintService {
    public static String generateHint(int target,int hintCount){
        if(hintCount==1){
            return (target%2==0)
                    ?"HINT: NUMBER IS EVEN"
                    :"HINT: NUMBER IS ODD";
        }else if(hintCount==2){
            return (target > 50)
                    ?"HINT : NUMBER IS LARGER THAN 50"
                    :"HINT : NUMBER IS SMALLER THAN 50";
        }
        return "NO MORE HINTS AVAILABLE";
    }
}

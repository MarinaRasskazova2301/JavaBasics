import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        if(array.length==0){
            return "[0]";
        }
        return Arrays.stream(array).sum()%2==0?"even":"odd";
    }
}

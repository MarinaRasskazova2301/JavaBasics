public class FindNextSquare {
    public static long findNextSquare(long sq) {

        return Math.pow((long)Math.sqrt(sq), 2)==sq? (long)Math.pow(Math.sqrt(sq)+1, 2):(-1);
    }
}

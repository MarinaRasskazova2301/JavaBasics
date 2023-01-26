import java.util.Arrays;

public class AdditiveInverse {
    public static int[] invert(int[] array) {

        return Arrays.stream(array).map(e->e*(-1)).toArray();
        //return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }
}

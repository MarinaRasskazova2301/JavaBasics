import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {

        if (n == 0) {
            return new int[]{0};
        }

        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(j)));
            j++;
        }
        return arr;
    }
}

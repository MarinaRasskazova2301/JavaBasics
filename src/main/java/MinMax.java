import java.util.Arrays;

public class MinMax {

    public static int[] minMax(int[] arr) {

        return new int[]{Arrays.stream(arr).min().getAsInt(),Arrays.stream(arr).max().getAsInt()};
//        Arrays.sort(arr);
//        return new int[]{arr[0],arr[arr.length-1]};
    }
}

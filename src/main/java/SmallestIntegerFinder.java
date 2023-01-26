import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
       return Arrays.stream(args).min().getAsInt();
  //   return IntStream.of(args).min().getAsInt();
    //    return IntStream.of(args).min().orElse(0)
    }
}

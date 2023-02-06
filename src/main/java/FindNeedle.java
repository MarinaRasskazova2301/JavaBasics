import java.util.Arrays;

public class FindNeedle {

    public static String findNeedle(Object[] haystack) {

        int index=Arrays.asList(haystack).indexOf("needle");

       return "found the needle at position "+index;
    }
}

import java.util.Arrays;

public class ArrayContainsValue {
    public static boolean check(Object[] a, Object x) {

        return Arrays.stream(a).anyMatch(i -> x.equals(i));
        //return Arrays.asList(a).contains(x);
    }
}



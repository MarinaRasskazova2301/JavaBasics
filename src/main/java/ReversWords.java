import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReversWords {

    public static String reverseWords(final String original) {
        String[] wordsSplit = original.split(" ");
        List list = Arrays.stream(wordsSplit).map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.toList());
        if(list.size() == 0)
            return original;
        StringBuilder reverseStringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {

            if (i != list.size() - 1) {
                reverseStringBuilder.append(list.get(i)).append(" ");
                System.out.println(reverseStringBuilder);
            } else {
                reverseStringBuilder.append(list.get(i));
            }

        }
        return reverseStringBuilder.toString();
    }
}

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest(String s1, String s2) {

        return distinctLetters(s1 + s2);
    }

    public static String distinctLetters(String text) {
        char[] letters = text.toCharArray();
        Arrays.sort(letters);
        StringBuilder sb = new StringBuilder();
        sb.append(letters[0]);
        System.out.println("Stringbuilder start: " + sb.toString());
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] != letters[i - 1]) {
                sb.append(letters[i]);
            }
        }
        return sb.toString();
    }

}

//    String s = s1 + s2;
//        return s.chars().distinct().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();

//    StringBuilder sb = new StringBuilder();
//        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
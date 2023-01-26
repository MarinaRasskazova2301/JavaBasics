import java.util.ArrayList;
import java.util.List;

public class NumberOfVowels {
    public static int getCount(String str) {

        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            letters.add(str.charAt(i));
        }
        return (int) letters.stream().filter(e -> e.equals('a') || e.equals('e') || e.equals('i') || e.equals('o') || e.equals('u')).count();
     //   return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}

//    int vowelsCount = 0;
//
//    for(char c : str.toCharArray())
//            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
//
//            return vowelsCount;
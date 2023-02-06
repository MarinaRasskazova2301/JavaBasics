import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {

        if(phrase==null||phrase.length()==0){
            return null;
        }



      return  Arrays.stream(phrase.split(" ")).map(word->word.replace(word.charAt(0), word.toUpperCase().charAt(0))).collect(Collectors.joining(" "));

    }
}

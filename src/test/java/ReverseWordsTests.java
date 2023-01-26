import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReverseWordsTests {
    @Test
    public void exampleCases() {
       assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReversWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReversWords.reverseWords("apple"));
        assertEquals("a b c d", ReversWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReversWords.reverseWords("double  spaced  words"));
    }
}




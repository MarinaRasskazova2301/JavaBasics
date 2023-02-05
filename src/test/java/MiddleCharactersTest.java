import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleCharactersTest {
    @Test
    public void evenTests() {
        assertEquals("es", MiddleCharacters.getMiddle("test"));
        assertEquals("dd", MiddleCharacters.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleCharacters.getMiddle("testing"));
        assertEquals("A", MiddleCharacters.getMiddle("A"));
    }
}

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class KataTests {

    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
        assertArrayEquals(new int[] {0}, Kata.digitize(0));
    }
}

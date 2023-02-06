import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageNumberTests {
    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, AverageNumber.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, AverageNumber.find_average(new int[]{1, 2, 3}), DELTA);
    }
}

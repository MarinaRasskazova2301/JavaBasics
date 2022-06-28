import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySumTests {
    @Test
    public void BasicTests() {
        assertEquals(16, ArraySum.sum(new int[] { 6, 2, 1, 8, 10}));
    }

}

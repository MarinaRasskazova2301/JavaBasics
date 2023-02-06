import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAndMinNumberTests {


    private MaxAndMinNumber  maxAndMinNumber = new MaxAndMinNumber();

    @Test
    public void testExamples() {
        assertEquals(-110, maxAndMinNumber.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, maxAndMinNumber.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, maxAndMinNumber.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, maxAndMinNumber.max(new int[]{5}));
    }
}





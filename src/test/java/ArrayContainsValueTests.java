import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayContainsValueTests {

    @Test
    public void testSomething() {
        assertEquals(ArrayContainsValue.check(new Object[]{66, 101}, 66), true);
        assertEquals(ArrayContainsValue.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(ArrayContainsValue.check(new Object[]{'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(ArrayContainsValue.check(new Object[]{"what", "a", "great", "kata"}, "kat"), false);
    }
}



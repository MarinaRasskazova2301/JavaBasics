import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTests {

        @Test
        public void testSomething() {
            assertEquals("Hello, Ryan how are you doing today?", Greeting.greet("Ryan"));
        }

}

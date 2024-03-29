import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrafficLightsTests {

    @Test
    public void update_light() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }
}

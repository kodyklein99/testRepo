
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testExamples {

    /**
     * Tests the constructor (for 100% coverage).
     */
    @Test
    public void testDefaultConstructor() {
        new examples();
    }

    @Test
    public void testRoundValue() {
        // fail("Not yet implemented");
        assertEquals("value 0.20, rem 0.20, realValue 0.25", examples.roundValue(0.2));
    }

}
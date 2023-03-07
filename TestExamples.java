
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestExamples {

    /**
     * Tests the constructor (for 100% coverage).
     */
    @Test
    public void testDefaultConstructor() {
        new Examples();
    }

    // roundValue is a static method and be called without creating an instance
    @Test
    public void testStaticRoundValue() {
        // fail("Not yet implemented");
        assertEquals(0.25, Examples.staticRoundValue(0.2));

    }

    // roundValue2 is not a static method and therefore an instance must be created
    // first
    @Test
    public void testnotStaticRoundValue() {
        // fail("Not yet implemented");
        Examples myObj = new Examples();
        assertEquals(0.25, myObj.notStaticRoundValue(0.2));
        assertEquals(0.25, myObj.notStaticRoundValue(0.25));

    }

    /**
     * This test fails because it is trying to access a private method from outside
     * the class.
     * 
     * @Test
     *       public void testRoundValue() {
     *       assertEquals(0.25, examples.roundValue(0.2));
     *       assertEquals(0.25, myObj.roundValue(0.25));
     *       }
     **/

}
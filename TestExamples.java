
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestExamples {

    /**
     * Tests the constructor (for 100% coverage).
     */
    @Test
    public void testDefaultConstructor() {
        new Examples(0.23, 0.25);
    }

    // roundValue is a static method and be called without creating an instance
    /*
     * @Test
     * public void testStaticRoundValue() {
     * // fail("Not yet implemented");
     * assertEquals(0.25, Examples.staticRoundValue(0.2));
     * 
     * }
     */

    // roundValue2 is not a static method and therefore an instance must be created
    // first
    @Test
    public void testNotStaticRoundValue() {
        // fail("Not yet implemented");
        Examples myObj = new Examples(0.23, 0.25);
        assertEquals(0.25, myObj.notStaticRoundValue());

        Examples myObj2 = new Examples(0.25, 0.25);
        assertEquals(0.25, myObj2.notStaticRoundValue());

    }

    @Test
    public void testGetters() {
        Examples myObj = new Examples(0.23, 0.25);
        assertEquals(0.25, myObj.getRoundToIncrement());
        assertEquals(0.23, myObj.getValue());

    }

    @Test
    public void testSetters() {
        Examples myObj = new Examples(0.23, 0.25);
        myObj.setRoundToIncrement(.5);
        myObj.setValue(.1);
        assertEquals(0.5, myObj.getRoundToIncrement());
        assertEquals(0.1, myObj.getValue());
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
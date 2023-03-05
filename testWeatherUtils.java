import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Tests the WeatherUtils class.
 *
 * @author
 * @version
 */
public class testWeatherUtils {

    /**
     * Tests the weatherAdvice method.
     */
    @Test
    public void testWeatherAdvice() {
        // fail("Not yet implemented");
        assertEquals("CANCEL", WeatherUtils.weatherAdvice(70.1, 0.0));
    }

}

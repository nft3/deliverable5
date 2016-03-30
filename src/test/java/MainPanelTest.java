import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Nick Treu
 */
public class MainPanelTest {

    private int size = 15;
    private MainPanel mp;

    @Before
    public void setup(){
        mp = new MainPanel(size);
    }


    // Test if we 0 that we passed into the function
    @Test
    public void testConvertToIntZero() {
        int num = 0;
        assertEquals(mp.convertToInt(num), num);
    }

    // Test if we can return the max integer value (edge case)
    @Test
    public void testConvertToIntMaxInt(){
        int num = Integer.MAX_VALUE;
        assertEquals(mp.convertToInt(num), num);
    }

    // Test if we can return the min integer value (edge case)
    @Test
    public void testCovertToIntMinInt(){
        int num = Integer.MIN_VALUE;
        assertEquals(mp.convertToInt(num), num);
    }

    // How do I test this? Measure in time it takes to run the code?
    // An unnecessary loop of 10,000 iterations every time we run continuously would
    // figure to have a big impact on the performance of the code.
    @Test
    public void testRunContinuous() {

    }
}
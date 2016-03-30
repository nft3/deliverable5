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

    // Since in this method I took out the for loop that modified _r, let's check that it is still the same
    // after this method is complete
    @Test
    public void testRunContinuous() {
        int startingValue = mp._r;
        mp.runContinuous();

        assertEquals(startingValue, mp._r);
    }


}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Nick Treu
 */
public class CellTest {

    private Cell cell;

    // Test that if a cell is alive, that the String returned is "X"
    @Test
    public void testToStringAlive() {
        boolean alive = true;
        cell = new Cell(alive);

        assertEquals("X", cell.toString());
    }

    // Test that if a cell is not alive, that the String returned is "."
    @Test
    public void testToStringNotAlive(){
        boolean alive = false;
        cell = new Cell(alive);

        assertEquals(".", cell.toString());
    }

    // Test that if a cell is alive that Null is NOT returned.
    @Test
    public void testToStringAliveNotNull(){
        boolean alive = true;
        cell = new Cell(alive);

        assertNotNull(cell.toString());
    }

    // Test that is a cell is not alive that Null is NOT returned.
    @Test
    public void testToStringNotAliveNotNull(){
        boolean alive = false;
        cell = new Cell(alive);

        assertNotNull(cell.toString());
    }
}
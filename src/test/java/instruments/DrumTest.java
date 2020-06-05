package instruments;

import instruments.Drums;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drums drums;

    @Before
    public void before() {
        drums = new Drums("Plastic", "Red",5, 2);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Plastic", drums.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", drums.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drums.getType());
    }

    @Test
    public void hasNoPieces() {
        assertEquals(5, drums.getNoOfPieces());
    }

    @Test
    public void hasNoSnares() {
        assertEquals(2, drums.getNoOfSnares());
    }

    @Test
    public void canPlay() {
        assertEquals("Boom! Boom! Boom!", drums.play());
    }
}

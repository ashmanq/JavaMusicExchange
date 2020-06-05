package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Purple", 6, "Electric");
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Purple", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasNoString() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void hasGuitarType() {
        assertEquals("Electric", guitar.getGuitarType());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum, strum, strum", guitar.play());
    }
}

package instruments;

import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;


    @Before
    public void before() {
        piano = new Piano("Wood", "Black", 88, "Grand");
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasNoOfKeys() {
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink plink plink", piano.play());
    }

    @Test
    public void hasPianoSize() {
        assertEquals("Grand", piano.getPianoSize());
    }
}

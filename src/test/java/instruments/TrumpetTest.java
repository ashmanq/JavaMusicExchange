package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Brass", "Gold", 3);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void hasNoValves() {
        assertEquals(3, trumpet.getNoOfValves());
    }


    @Test
    public void canPlay() {
        assertEquals("Pah-pa-ra!", trumpet.play());
    }
}

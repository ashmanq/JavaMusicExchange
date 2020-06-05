package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    
    Flute flute;
    
    @Before()
    public void before() {
        flute = new Flute("Metal", "Silver", "Piccolo");
    }

    @Test
    public void hasMaterial() {
        assertEquals("Metal", flute.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", flute.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void hasFluteType() {
        assertEquals("Piccolo", flute.getFluteType());
    }


    @Test
    public void canPlay() {
        assertEquals("Toot toot toot", flute.play());
    }
    
}

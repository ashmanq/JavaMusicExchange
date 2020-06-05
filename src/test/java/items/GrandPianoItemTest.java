package items;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import sun.awt.CGraphicsConfig;

import static org.junit.Assert.assertEquals;

public class GrandPianoItemTest {

    private GrandPianoItem grandPianoItem;
    private Piano piano;

    @Before()
    public void before() {
        piano = new Piano("Wood", "Black", 88,"Grand");
        String description = "A Steinway Grand Piano.";
        grandPianoItem = new GrandPianoItem(description, 20000.00, 40000.00, piano);
    }

    @Test
    public void hasDescription() {
        assertEquals("A Steinway Grand Piano.", grandPianoItem.getDescription());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(20000.00, grandPianoItem.getCostPrice(), 0.01);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(40000.00, grandPianoItem.getSalePrice(), 0.01);
    }

    @Test
    public void hasInstrument() {
        assertEquals(piano, grandPianoItem.getInstrument());
    }

    @Test
    public void canChangeDescription() {
        grandPianoItem.setDescription("A new description.");
        assertEquals("A new description.", grandPianoItem.getDescription());
    }

    @Test
    public void canSetCostPrice() {
        grandPianoItem.setCostPrice(19000.00);
        assertEquals(19000.00, grandPianoItem.getCostPrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        grandPianoItem.setSalePrice(38000.00);
        assertEquals(38000.00, grandPianoItem.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20000.00, grandPianoItem.calculateMarkup(), 0.01);
    }
}

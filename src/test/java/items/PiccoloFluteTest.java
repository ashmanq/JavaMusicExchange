package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiccoloFluteTest {
    
    private PiccoloFluteItem piccoloFluteItem;
    
    
    @Before
    public void before() {
        piccoloFluteItem = new PiccoloFluteItem("A simple piccolo flute.", 50.00, 90.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("A simple piccolo flute.", piccoloFluteItem.getDescription());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(50.00, piccoloFluteItem.getCostPrice(), 0.01);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(90.00, piccoloFluteItem.getSalePrice(), 0.01);
    }

    @Test
    public void hasInstrument() {
        assertEquals("Picollo", piccoloFluteItem.getFlute().getFluteType());
    }

    @Test
    public void canChangeDescription() {
        piccoloFluteItem.setDescription("A new description.");
        assertEquals("A new description.", piccoloFluteItem.getDescription());
    }

    @Test
    public void canSetCostPrice() {
        piccoloFluteItem.setCostPrice(90.00);
        assertEquals(90.00, piccoloFluteItem.getCostPrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        piccoloFluteItem.setSalePrice(200.00);
        assertEquals(200.00, piccoloFluteItem.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(40.00, piccoloFluteItem.calculateMarkup(), 0.01);
    }
}

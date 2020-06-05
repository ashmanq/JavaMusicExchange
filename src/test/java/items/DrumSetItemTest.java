package items;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSetItemTest {

    private LargeDrumSetItem largeDrumSetItem;

    @Before()
    public void before() {

        String description = "A large drum set.";
        largeDrumSetItem = new LargeDrumSetItem(description, 100.00, 250.00);

    }


    @Test
    public void hasDescription() {
        assertEquals("A large drum set.", largeDrumSetItem.getDescription());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(100.00, largeDrumSetItem.getCostPrice(), 0.01);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(250.00, largeDrumSetItem.getSalePrice(), 0.01);
    }

    @Test
    public void hasInstrument() {
        assertEquals("Red", largeDrumSetItem.getDrums().getColour());
    }

    @Test
    public void canChangeDescription() {
        largeDrumSetItem.setDescription("A new description.");
        assertEquals("A new description.", largeDrumSetItem.getDescription());
    }

    @Test
    public void canSetCostPrice() {
        largeDrumSetItem.setCostPrice(50.00);
        assertEquals(50.00, largeDrumSetItem.getCostPrice(), 0.01);
    }

    @Test
    public void canSetSalePrice() {
        largeDrumSetItem.setSalePrice(600.00);
        assertEquals(600.00, largeDrumSetItem.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(150.00, largeDrumSetItem.calculateMarkup(), 0.01);
    }
}

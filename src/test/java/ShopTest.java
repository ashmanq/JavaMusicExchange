import behaviours.ISell;
import items.GrandPianoItem;
import items.LargeDrumSetItem;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell instrument1, instrument2;

    @Before
    public void before() {
        instrument1 = new LargeDrumSetItem("A large drum set.", 200, 300);
        instrument2 = new GrandPianoItem("A grand piano.", 10000, 13000);
        shop = new Shop("Ash's Musical Emporium");
    }

    @Test
    public void hasName() {
        assertEquals("Ash's Musical Emporium", shop.getName());
    }

    @Test
    public void startsWithNoItems() {
        assertEquals(0, shop.noOfItems());
    }

    @Test
    public void canAddItem() {
        shop.addItem(instrument1);
        assertEquals(1, shop.noOfItems());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(instrument1);
        shop.addItem(instrument2);
        assertEquals(2, shop.noOfItems());
        shop.removeItem(instrument1);
        assertEquals(1, shop.noOfItems());
    }

    @Test
    public void canCalcTotalPotentialProfit() {
        shop.addItem(instrument1);
        shop.addItem(instrument2);
        assertEquals(3100.00, shop.calcTotalPotentialProfit(), 0.01);
    }
}

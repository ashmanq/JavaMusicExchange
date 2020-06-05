package items;

import instruments.Drums;

public class LargeDrumSetItem extends Items {

    private Drums drums;

    public LargeDrumSetItem(String description, double costPrice, double salePrice) {
        super(description, costPrice, salePrice);
        this.drums = new Drums("Wood", "Red", 5,4);
    }

    public Drums getDrums() {
        return drums;
    }


}

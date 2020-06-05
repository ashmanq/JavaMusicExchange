package items;

import instruments.Flute;

public class PiccoloFluteItem extends Items{

    private Flute flute;

    public PiccoloFluteItem(String description, double costPrice, double salePrice) {
        super(description, costPrice, salePrice);
        this.flute = new Flute("Metal", "Silver", "Picollo");
    }

    public Flute getFlute() {
        return flute;
    }
}

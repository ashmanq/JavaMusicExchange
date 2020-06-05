package items;

import instruments.Instrument;
import instruments.Piano;

public class GrandPianoItem extends Items{

    Piano piano;

    public GrandPianoItem(String description, double costPrice, double salePrice) {
        super(description, costPrice, salePrice);
        this.piano =  new Piano("Wood", "Black", 88,"Grand");;
    }

    public Piano getPiano() {
        return piano;
    }
}

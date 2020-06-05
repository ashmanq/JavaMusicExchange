package items;

import instruments.Instrument;

public class GrandPianoItem extends Items{

    Instrument instrument;

    public GrandPianoItem(String description, double costPrice, double salePrice, Instrument instrument) {
        super(description, costPrice, salePrice);
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}

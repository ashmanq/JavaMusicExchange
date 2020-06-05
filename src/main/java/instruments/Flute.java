package instruments;

import behaviours.IPlay;

public class Flute extends Instrument {

    String fluteType;

    public Flute(String material, String colour, String fluteType) {
        super(material, colour, InstrumentType.WOODWIND);
        this.fluteType = fluteType;
    }

    public String getFluteType() {
        return fluteType;
    }

    public String play() {
        return "Toot toot toot";
    }
}

package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private Enum<InstrumentType> type;

    public Instrument(String material, String colour, Enum<InstrumentType> type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Enum<InstrumentType> getType() {
        return type;
    }
}

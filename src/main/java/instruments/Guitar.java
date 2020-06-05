package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int noOfStrings;
    private String guitarType;

    public Guitar(String material, String colour, int noOfStrings, String guitarType) {
        super(material, colour, InstrumentType.STRING);
        this.noOfStrings = noOfStrings;
        this.guitarType = guitarType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String play() {
        return "Strum, strum, strum";
    }
}

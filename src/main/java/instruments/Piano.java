package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int noOfKeys;
    private String pianoSize;

    public Piano(String material, String colour, int noOfKeys, String pianoSize) {
        super(material, colour, InstrumentType.KEYBOARD);
        this.noOfKeys = noOfKeys;
        this.pianoSize = pianoSize;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public String getPianoSize() {
        return pianoSize;
    }

    public String play() {
        return "Plink plink plink";
    }
}

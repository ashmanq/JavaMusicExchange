package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    int noOfValves;

    public Trumpet(String material, String colour, int noOfValves) {
        super(material, colour, InstrumentType.BRASS);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public String play() {
        return "Pah-pa-ra!";
    }
}

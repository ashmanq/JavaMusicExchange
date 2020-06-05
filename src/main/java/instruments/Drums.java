package instruments;


public class Drums extends Instrument {

    private int noOfPieces;
    private int noOfSnares;

    public Drums(String material, String colour, int noOfPieces, int noOfSnares) {
        super(material, colour, InstrumentType.PERCUSSION);
        this.noOfPieces = noOfPieces;
        this.noOfSnares = noOfSnares;
    }

    public int getNoOfPieces() {
        return noOfPieces;
    }

    public int getNoOfSnares() {
        return noOfSnares;
    }

    public String play() {
        return "Boom! Boom! Boom!";
    }
}

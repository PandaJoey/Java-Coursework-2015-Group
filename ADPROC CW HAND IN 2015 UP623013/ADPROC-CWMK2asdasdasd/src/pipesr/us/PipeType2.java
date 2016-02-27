package pipesr.us;

/**
 * A class to determine if the user inputs the correct parameters for the pipe
 * of type 2.
 *
 * @author up623013
 * @author up674771
 * @version 01/12/2015
 */
public class PipeType2 extends Pipe {

    private final double gradePrice = super.priceOfGrade;
    private final double chemicalResistance = super.chemicalResistance;
    private double pipePrice;
    private final double colour = gradePrice * 12 / 100;

    /**
     * Constructs a pipe of type 2.
     *
     * @param grade Takes in the user input for grade.
     * @param chemical Takes in user input for chemical resistance.
     */
    public PipeType2(int grade, boolean chemical) {
        super(grade, chemical);
    }

    /**
     * A Method to return the price of a pipe of type 2.
     *
     * @return returns price of the pipe.
     */
    @Override
    public double getAQuote() {
        pipePrice = gradePrice + colour + chemicalResistance;
        return pipePrice;
    }
}

package pipesr.us;

/**
 * A class to determine if the user inputs the correct parameters for the pipe
 * of type 1.
 *
 * @author up623013
 * @author up674771
 * @version 01/12/2015
 */
public class PipeType1 extends Pipe {

    private final double gradePrice = super.priceOfGrade;
    private final double chemicalResistance;
    private double pipePrice;

    /**
     * Constructs a pipe of type 1.
     *
     * @param grade Takes in the user input for grade.
     * @param chemical Takes in user input for chemical resistance.
     */
    public PipeType1(int grade, boolean chemical) {
        super(grade, chemical);
        this.chemicalResistance = super.chemicalResistance;
    }

    /**
     * A Method to return the price of a pipe of type 1.
     *
     * @return returns price of the pipe.
     */
    @Override
    public double getAQuote() {
        pipePrice = gradePrice + chemicalResistance;
        return pipePrice;
    }
}

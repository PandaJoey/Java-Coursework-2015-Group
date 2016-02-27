package pipesr.us;

/**
 * A class to determine if the user inputs the correct parameters for the pipe
 * of type 5.
 *
 * @author up623013
 * @author up674771
 * @version 01/12/2015
 */
public class PipeType5 extends Pipe {

    private final double gradePrice = super.priceOfGrade;
    private final double chemicalResistance = super.chemicalResistance;
    private double pipePrice;
    private double colour = gradePrice * 17 / 100;
    private final double innerInsulation = gradePrice * 14 / 100;
    private final double outerReinforcement = gradePrice * 15 / 100;

    /**
     * Constructs a pipe of type 5.
     *
     * @param grade Takes in the user input for grade.
     * @param chemical Takes in user input for chemical resistance.
     */
    public PipeType5(int grade, boolean chemical) {
        super(grade, chemical);
    }

    /**
     * A Method to get a pipePrice for the price of pipe type 5.
     *
     * @return returns price of the pipe.
     */
    @Override
    public double getAQuote() {
        pipePrice = gradePrice + colour + innerInsulation + outerReinforcement + chemicalResistance;
        return pipePrice;
    }
}

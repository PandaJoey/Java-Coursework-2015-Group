package pipesr.us;

/**
 * Creates an abstract class Pipe with one abstract method getAQuote, which is
 * used to find the price of each type of pipe.
 *
 * @author up623013
 * @author up674771
 * @version 01/12/2015 
 */
public abstract class Pipe {

    protected double priceOfGrade;
    protected double chemicalResistance;
    protected double[] plasticGrade = new double[]{0.3, 0.32, 0.35, 0.4, 0.46};

    /**
     * Default Pipe Constructor.
     */
    public Pipe() {

    }

    /**
     * Main Pipe Constructor, used to determine the type of pipe the user has
     * selected.
     *
     * @param grade Takes in the grade the user has selected.
     * @param chemical Takes in user input for chemical resistance.
     */
    public Pipe(int grade, boolean chemical) {

        for (int i = 1; i < 6; i++) {
            if (grade == i) {
                priceOfGrade = plasticGrade[i - 1];
            }
            chemicalResistance = chemical ? priceOfGrade * 12 / 100 : 0.0;

        }
    }

    /**
     * An abstract method to determine the cost of a pipe that the user has
     * asked for.
     *
     * @return returns the price of the pipe.
     */
    public abstract double getAQuote();

}

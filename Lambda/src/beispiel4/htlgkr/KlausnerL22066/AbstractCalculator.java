package beispiel4.htlgkr.KlausnerL22066;

public abstract class   AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number x, Number y);

    public abstract Number subtract(Number x, Number y);

    public abstract Number multiply(Number x, Number y);
    public abstract Number divide(Number x, Number y);

}

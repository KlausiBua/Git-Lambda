package beispiel4.htlgkr.KlausnerL22066;

public class RationalCalculator extends AbstractCalculator{


    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(
                (x, y) -> new Number(x.getA() + y.getA(), 0),
                (x, y) -> new Number(x.getA() - y.getA(), 0),
                (x, y) -> new Number(x.getA() * y.getA(), 0),
                (x, y) -> new Number(x.getA() / y.getA(), 0)
        );
    }

    @Override
    public Number add(Number x, Number y) {
        return add.calc(x, y);
    }

    @Override
    public Number subtract(Number x, Number y) {
        return subtract.calc(x, y);
    }

    @Override
    public Number multiply(Number x, Number y) {
        return multiply.calc(x, y);
    }

    @Override
    public Number divide(Number x, Number y) {
        return divide.calc(x, y);
    }
}

package beispiel4.htlgkr.KlausnerL22066;

public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator() {
        super(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                (x, y) -> new Number(x.getA() * y.getB() - x.getB() * y.getA(), 0),
                (x, y) -> new Number(x.getA() * y.getA() + x.getB() * y.getB(), 0)
        );
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
}

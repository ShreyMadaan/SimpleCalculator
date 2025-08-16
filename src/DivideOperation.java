public class DivideOperation implements Operation {
    @Override
    public double apply(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}

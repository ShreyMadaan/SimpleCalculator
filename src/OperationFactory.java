public class OperationFactory {
    public Operation fromOperator(char operator) {
        switch (operator) {
            case '+': return new AddOperation();
            case '-': return new SubtractOperation();
            case '*': return new MultiplyOperation();
            case '/': return new DivideOperation();
            case '%': return new ModulusOperation();
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}

public class LoggingCalculator extends CalculatorDecorator {
    public LoggingCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public void performOperation(String operation, double value) {
        System.out.println("Performing operation: " + operation + " with value: " + value);
        super.performOperation(operation, value);
        System.out.println("Result after operation: " + operation + " is " + super.getResult());
    }
}

import java.util.Scanner;

public class UserInput {
    private InputValidator validator;

    public UserInput() {
        validator = new InputValidator(new Scanner(System.in));
    }

    public String getOperation() {
        System.out.println("Enter an operation (+, -, *, /) or 'q' to quit:");
        return new Scanner(System.in).nextLine();
    }

    public double getValue() {
        return validator.getValidDouble();
    }

    public void close() {
        validator.closeScanner();
    }
}

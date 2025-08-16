import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationFactory factory = new OperationFactory();
        System.out.println("=== Simple Calculator ===");
        System.out.println("Tip: You can exit anytime by typing 'x' or 'X'");

        while (true) {
            // First Number
            System.out.print("Enter first number: ");
            String firstInput = sc.next();
            if (firstInput.equalsIgnoreCase("x")) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
            while (!isNumeric(firstInput)) {
                System.out.println("Invalid input! Please enter a number or 'x' to exit.");
                firstInput = sc.next();
                if (firstInput.equalsIgnoreCase("x")) {
                    System.out.println("Exiting Calculator. Goodbye!");
                    return;
                }
            }
            double num1 = Double.parseDouble(firstInput);

            // Operator
            System.out.print("Enter an operator (+, -, *, /, %): ");
            String opInput = sc.next();
            if (opInput.equalsIgnoreCase("x")) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
            char operator = opInput.charAt(0);
            if ("+-*/%".indexOf(operator) == -1) {
                System.out.println("Invalid operator! Please try again.");
                continue;
            }

            // Second Number
            System.out.print("Enter second number: ");
            String secondInput = sc.next();
            if (secondInput.equalsIgnoreCase("x")) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
            while (!isNumeric(secondInput)) {
                System.out.println("Invalid input! Please enter a number or 'x' to exit.");
                secondInput = sc.next();
                if (secondInput.equalsIgnoreCase("x")) {
                    System.out.println("Exiting Calculator. Goodbye!");
                    return;
                }
            }
            double num2 = Double.parseDouble(secondInput);

            // Perform Calculation via Strategy
            try {
                Operation operation = factory.fromOperator(operator);
                double result = operation.apply(num1, num2);
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

            System.out.println("-------------------------");
        }

        sc.close();
    }

    // Helper Method
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
